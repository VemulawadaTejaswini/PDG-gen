import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int k = scan.nextInt();

    int count = 0;
    for (int i=0;i<n;i++){
      int t = scan.nextInt();
      if (t == 1){
        count = i+1;
        break;
      }
    }
    int l = count-1;
    int r = n-count;
    ArrayList<Integer> g = new ArrayList<Integer>();

    for (int j=0;j<=k-1;j++){
      int kk = k-1-j;
      int ret = find(count-1-j,k-1) + find(n-count-kk,k-1)+1;
      g.add(ret);
    }
    Collections.sort(g);
    System.out.println(g.get(0));
  }

  static int find(int a, int b){
    if (a<=0){
      return 0;
    }
    int ret = (int) a/b;
    if (b*ret == a){
      return ret;
    }
    return ret+1;
  }

}
