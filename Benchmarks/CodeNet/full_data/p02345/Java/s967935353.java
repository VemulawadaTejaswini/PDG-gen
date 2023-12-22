import java.util.*;

class Main {
  static int[] a;
  static final int INIT = 2147483647;
  static ArrayList<Integer> ansArr = new ArrayList<Integer>();

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();

    a = new int[INIT];
    for(int i = 0 ; i < n*2-1 ; i++) {
      a[i] = INIT;
    }

    int com,x,y = 0;
    q=q-1;
    while(q != -1) {
      com = sc.nextInt();
      x = sc.nextInt();
      y = sc.nextInt();
      if(com == 0) {
        update(x,y,n);
      } else ansArr.add(find(x,y+1,0,0,n));
      q--;
    }

    for(int ans: ansArr) System.out.println(ans);
	}

  static void update(int x, int y, int n){
    x += n-1;
    a[x] = y;
    while(x > 0){
      x = (x - 1)/2;
      a[x] = Math.min(a[x*2+1],a[x*2+2]);
    }
  }

  static int find(int x, int y, int i, int l, int r) {
    if(r <= x || y <= l)
      return INIT;
    if(x <= l && r <= y) {
      return a[i];
    } else {
      int vl = find(x,y,i*2+1,l,(l+r)/2);
      int vr = find(x,y,i*2+2,(l+r)/2,r);
      return Math.min(vl,vr);
    }
  }
}

