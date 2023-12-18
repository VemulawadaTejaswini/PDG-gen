import java.util.*;

class Main {
    static  long knap(int[] w , int[] v, int n, int W) { 
        long arr[][] = new long[n+1][W+1];
        for (int i =1 ; i<=n; i++) {
            for (int j =1 ;j<=W ; j++) {
                if(j>=w[i-1]) {
                    arr[i][j] = Math.max(arr[i-1][j],v[i-1]+arr[i-1][j-w[i-1]]);
                }
                else {
                    arr[i][j] = arr[i-1][j];
                }
            }
        }
        return arr[n][W];
    }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int W = s.nextInt();
    //int  k = s.nextInt();
    int w[] = new int[n];
    int v[] = new int[n];
    for (int i =0 ; i<n ;i++) {
        w[i] = s.nextInt();
        v[i] = s.nextInt();
    }
    System.out.println(knap(w,v,n,W));
  
  }
}