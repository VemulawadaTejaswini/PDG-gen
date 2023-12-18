import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int d = stdIn.nextInt();
    int ans = 0;
    int i = d;
    int[] a = new int[n];
    while(true) {
      if(n<i+2*d) {
        ans++;
        System.out.println(ans);
        break;
      }
      i += 2*d;
      ans++;
    }
    /*for(int i = d;;) {
      if(hantei(a)) {
        //System.out.println("a");
        System.out.println(ans);
        System.exit(0);
      }
      //System.out.println(i);
      unko(a,d,i);
      ans++;
      if(hantei(a)) {
        //System.out.println("a");
        System.out.println(ans);
        System.exit(0);
      }
      if(i+2*d>=a.length) {
        System.out.println("b");
        System.out.println(++ans);
        System.exit(0);
      }
      i += 2*d;
    }*/
  }
  public static boolean hantei(int[] a) {
    int count = 0;
    for(int i = 0;i<a.length;i++) {
      if(a[i]==1) count++;
    }
    if(count==a.length) return true;
    else return false;
  }
  public static void unko(int[] a,int d,int i) {
      for(int j = 0;j<d;j++) {
        a[i-j] = 1;
        a[i+j] = 1;
      }
  }
}