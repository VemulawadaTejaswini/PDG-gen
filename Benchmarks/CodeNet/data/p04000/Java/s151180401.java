import java.util.Scanner;

public class Main {
	
	public static int[][] x;
	static int N;
	
	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int W = sc.nextInt();
		N = sc.nextInt();
		
		x 			= new int[N][2];
		int[] A 	= new int[3];			
		int[] ans 	= new int[10];
		
		for(int i=0; i<N; i++){
			x[i][0] = sc.nextInt();
			x[i][1] = sc.nextInt();
		}
		
		for(int i=0; i<H-2; i++){
			A[0] = check(i, 0);
			A[1] = check(i, 1);
			
			int u=2;
			
			
			for(int j=0; j<W-2; j++){
				
				A[u] = check(i, j+2);
				if(u == 0) u=1;
				else if(u == 1) u = 2;
				else u =0;
				
				int n=0;
				for(int k=0; k<3; k++) n += A[k];
				ans[n]++;
				
				
			}
		}
		
		for(int i=0; i<10; i++){
			System.out.println(ans[i]);
		}
		
		sc.close();
	}
	
	static int check(int i, int j){
		int n = 0;
		for(int k=0; k<N; k++){
			if(x[k][1] == j+1){
				if(x[k][0] == i+1) n++;
				if(x[k][0] == i+2) n++;
				if(x[k][0] == i+3) n++;
			}
		}
		return n;
	}
}
