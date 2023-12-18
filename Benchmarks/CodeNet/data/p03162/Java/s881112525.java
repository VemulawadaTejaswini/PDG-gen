import java.util.*;

class Main {
    static public int minFallingPathSum(int[][] A) {
        int arr[][] = new int[A.length][A[0].length];
        for (int i = 0 ; i<A[0].length;i++) {
            arr[0][i] = A[0][i];
        }
        for (int i = 1 ; i<A.length;i++) {
            for (int j = 0 ; j<A[i].length;j++) {
                int min = Integer.MIN_VALUE;
                for (int k =0 ; k<A[i].length ;k++) {
                    
                    if(k!=j) {
                        min = Math.max(arr[i-1][k], min);
                    }
                }
                                

                     arr[i][j] = min +A[i][j];
                
            }
        }
     int min = Integer.MIN_VALUE;
        
        for(int i=0 ;i<arr[0].length;i++) {
           // System.out.println(arr[arr.length-1][i]);
            if(min<arr[arr.length-1][i]) {
            min = arr[arr.length-1][i];
            }
        }
        return min;
    }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    //int  k = s.nextInt();
    int arr[][] = new int[n][n];
    for (int i =0 ; i<n ;i++) {
        for(int j =0 ; j<n ;j++) {
            arr[i][j] = s.nextInt();
        }
    }
    System.out.println(minFallingPathSum(arr));
  
  }
}