import java.util.Scanner;


public class Main{
	public static long Knapsack(int W,int n,long[]w,long[]v){
		int i;int j = 0;
		long[][] k=new long[n+1][W+1];
		for(i=0;i<=n;i++){
			for(j=0;j<=W;j++){
		        if(i==0||j==0){
			        k[i][j]= 0;
		        }else{
		        	if(w[i-1]>j){
		        		k[i][j]=k[i-1][j];
		        	}else{
		        		k[i][j]=Math.max(v[i-1]+k[i-1][(int) (j-w[i-1])],k[i-1][j] );
		        	}
		        }
			}
		}return k[i-1][j-1];
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int W=sc.nextInt();
		long []v=new long[n];
		long []w=new long[n];
		for(int i=0;i<n;i++){
			w[i]=sc.nextLong();
			v[i]=sc.nextLong();
		}
		System.out.print(Knapsack(W,n,w,v));
	}
}