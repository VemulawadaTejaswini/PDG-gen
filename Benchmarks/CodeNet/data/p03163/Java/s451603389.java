import java.util.Scanner;

public class Main{
  
  
  static long max(long a,long b) {
  		return a>b ? a: b;
  	}
  static long knapsack(int W, int arr[],int val[],int n){
  		
    	long grid[][]=new long[n+1][W+1];
    	for(int i=0;i<=n;i++){
        	for(int j=0;j<=W;j++){
        	    
              	if(i == 0 || j == 0)
                  grid[i][j]=0;
              	else if(arr[i-1]<=j)
                   grid[i][j]=max(grid[i-1][j], val[i-1]+grid[i-1][j-arr[i-1]]);     
              	else
                 grid[i][j]=grid[i-1][j];
            
            }
        }
    	return grid[n][W];
  
  }
	public static void main(String [] args){
    	Scanner sc=new Scanner(System.in);
      	int n=sc.nextInt();
      	int W=sc.nextInt();
      	int arr[]=new int[n];
      	int val[]=new int[n];
      	for(int i=0;i<n;i++){
        	arr[i]=sc.nextInt();
          	val[i]=sc.nextInt();
        }
      	long res = knapsack(W,arr,val,n);
      	System.out.println(res);
    }
}