import java.util.*;

public class Main {

  public static int N;
  public static int M;
  public static int[] a;
  public static long mod = 1000000007;
  public static int count;

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    N = sc.nextInt();
    M = sc.nextInt();
    a = new int[M];
    
    for (int i = 0; i < M; i++) {
      a[i] = sc.nextInt();
    }

    sc.close();

    dfs(0,0);

    System.out.println(count % mod);
    
  }

  public static void dfs(int i, int j){

    if (N <= i) {
      count++;
      //System.out.println("OK");
      return;
    }
    
    //System.out.print(i + " ");

    if (j < a.length) {

      if (a[j] < i) {    

        if (j + 1 < a.length) {
          j++;
        }

        //System.out.println("jを"+j+"（"+a[j]+"）に変えます");
      }

      if (i == a[j]){
        //System.out.println(i+"の穴に落ちます");
        return;  
      }

    }

    dfs(i+1,j);
 
    if (i != N - 1) {
      dfs(i+2,j);
    }

  }

}