import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    int sum = 0;
    int q = scan.nextInt();
    int[][] a = new int[q][4];
    for (int i=0;i<q;i++){
      for (int j=0;j<4;j++){
        a[i][j] = scan.nextInt();
      }
    }
    int [] d = new int[n];
    ArrayList<Integer> empty = new ArrayList<Integer>();
    ArrayList<Integer> dd = all(n,m,d,0,1,a,q,empty);

    for (int i=0;i<dd.size();i++){
      if (sum < dd.get(i)){
        sum = dd.get(i);
      }
    }
    System.out.println(sum);
  }

  public static int check(int[][] a, int[] b, int q){
    int sum = 0;
    for (int i=0;i<q;i++){
      int what = b[a[i][1]-1] - b[a[i][0]-1];
      if (what == a[i][2]){
        sum += a[i][3];
      }
    }
    return sum;
  }

  public static ArrayList<Integer> all(int n, int m, int[] a, int current, int k,int[][] gg,int q,ArrayList<Integer> s){
    if (current == n){
      int ww = check(gg,a,q);
      s.add(ww);
      return s;
    }

    for (int i=k;i<=m;i++){
      a[current] = i;
      all(n,m,a,current+1,i,gg,q,s);
      a[current] = 0;
    }

    return s;
  }
}
