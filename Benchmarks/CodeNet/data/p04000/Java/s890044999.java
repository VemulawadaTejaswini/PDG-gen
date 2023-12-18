import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	
	public static boolean[][] x;
	
	public static void main(String[] args) throws Exception{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int W = sc.nextInt();
		int N = sc.nextInt();
		
		x = new boolean[H+1][W+1];
		
		for(int i=0; i<H+1; i++){
			for(int j=0; j<W+1; j++){
				x[i][j] = false;
			}
		}
			
		int[] ans = new int[10];
		
		for(int i=0; i<N; i++){
			int h = sc.nextInt();
			int w = sc.nextInt();
			x[h-1][w-1] = true;
		}
		
		int[] A = new int[3];
		
		
		for(int i=0; i<H-2; i++){
			A[0] = check(i, 0);
			A[1] = check(i, 1);
			A[2] = check(i, 2);
			
			int u=0;
			
			for(int j=0; j<W-2; j++){
				int n=0;
				for(int k=0; k<3; k++) n += A[k];
				ans[n]++;
				
				A[u] = check(i, j+3);
				if(u == 0) u=1;
				else if(u == 1) u = 2;
				else u =0;
			}
		}
		
		for(int i=0; i<10; i++){
			System.out.println(ans[i]);
		}
	}
	
	static int check(int i, int j){
		int n=0;
		if(x[i][j] == true) n++;
		if(x[i+1][j] == true) n++;
		if(x[i+2][j] == true) n++;
		return n;
	}
}
