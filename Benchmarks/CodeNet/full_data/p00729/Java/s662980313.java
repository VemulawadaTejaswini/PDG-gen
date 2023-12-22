import java.util.Scanner;

public class Main {
	
	static class State{
		int x, y;
		State(int x, int y){
			this.x=x;
			this.y=y;
		}
	}
	
	public static void main(String args[]){
		try(Scanner sc=new Scanner(System.in)){
			while(sc.hasNext()) {
				int N=sc.nextInt();//PC数
				int M=sc.nextInt();//学生数
				if(N==0) break;
				int r=sc.nextInt();
				
				int[][] startpc=new int[N+1][M+1];
				int[][] timepc=new int[N+1][1300];
				int[] time=new int[M+1];
				
				for(int i=0; i<r; i++) {
					int t=sc.nextInt();
					int n=sc.nextInt();
					int m=sc.nextInt();
					int s=sc.nextInt();
					if(s==1) {
						startpc[n][m]=t;
					}
					else if(s==0) {
						for(int j=startpc[n][m]; j<t; j++) {
							timepc[n][j]=m;
						}
					}
				}
				int q=sc.nextInt();
				for(int i=0; i<q; i++) {
					int ts=sc.nextInt();
					int te=sc.nextInt();
					int m=sc.nextInt();
					int num=0;
					int sum=0;
					for(int j=ts; j<te; j++) {
						num=0;
						for(int k=1; k<=N; k++) {
							if(timepc[k][j]==m) {
								num=1;
							}
						}
						sum+=num;
					}
					System.out.println(sum);
					
				}
				
				
				
			}
			
			
		}
	}
} 
