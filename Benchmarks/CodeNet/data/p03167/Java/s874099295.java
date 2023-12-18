import java.util.*;
public class Main {
  	static int mod = 1000000007;
	public static void main(String args[]){
    	Scanner s = new Scanner(System.in);
      	int M = s.nextInt();
      	int N = s.nextInt();
      	int[][] matrix = new int[M][N];
      	for(int i=0;i<M;i++){
        	String str = s.next();
          	for(int j=0;j<N;j++){
            	matrix[i][j] = str.charAt(j)=='#'?0:1;
            }
        }
      	for(int i=0;i<M;i++){
          	for(int j=0;j<N;j++){
              	if(i==0 && j==0){
                } else if(matrix[i][j]!=0){
                	int a = i>0?matrix[i-1][j]:0;
                  	int b = j>0?matrix[i][j-1]:0;
                  	matrix[i][j]=(a+b)%mod;
                }
              	//System.out.print(matrix[i][j]+" ");
            }
          	//System.out.println();
        }
      	System.out.println(matrix[M-1][N-1]);
    }
}