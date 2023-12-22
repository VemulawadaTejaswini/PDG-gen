import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		new Main();
	}
	public Main(){
		new Asia2010_B().doIt();
//		new NY2015_C().doIt();
	}
	class Asia2010_B{
		int MAX = Integer.MAX_VALUE / 2;
		void solve(int Move[],int Time[],int n){
			int DP[][][] = new int[n+1][101][4];
			for(int i = 0;i < n+1;i++){
				for(int j = 0;j < 101;j++){
					for(int k = 0;k < 4;k++){
						DP[i][j][k] = MAX;
					}
				}
			}
			for(int i = 0;i < n;i++){
				Move[i] = sc.nextInt();
				Time[i] = sc.nextInt();
			}
			DP[0][0][0] = 0;
			int time = 0;
			for(int i = 0;i < n;i++){
				boolean check = false;
				for(int j = 0;j < 101;j++){
					for(int k = 0;k < 4;k++){
						if(DP[i][j][k] == MAX)continue;
						else{
							int move = Math.abs(j - Move[i]) * (k + 1) + time;
							if(move <= Time[i] && k < 3){
								check = true;
								DP[i+1][Move[i]][k + 1] = Math.min(DP[i+1][Move[i]][k + 1], DP[i][j][k] + Math.abs(j - Move[i]));
//								System.out.print(DP[i+1][Move[i]][k + 1]+" : "+Move[i]+" ");
							}
							move = j * (k + 1) + Move[i] + time;
							if(move <= Time[i]){
								check = true;
								DP[i+1][Move[i]][1] = Math.min(DP[i+1][Move[i]][1], DP[i][j][k] + j + Move[i]);
//								System.out.print(DP[i+1][Move[i]][1]+" : "+Move[i]+" ");
							}
						}
					}
				}
				time = Time[i];
				if(!check){
					System.out.println("NG "+(i+1));
					return;
				}
//				System.out.println("check:"+i);
			}
			int min = MAX;
			for(int i = 0;i < 101;i++){
				for(int j = 0;j < 4;j++){
					if(DP[n][i][j] != MAX)min = Math.min(min, DP[n][i][j] + i);
				}
			}
			System.out.println("OK "+min);
		}
		void doIt(){
			while(true){
				int n = sc.nextInt();
				if(n == 0)break;
				int Move[] = new int[n];
				int Time[] = new int[n];
				solve(Move,Time,n);
			}
		}
	}
	class NY2015_C{
		long MOD = 1000000000;
		long [][] mul(long A[][],long B[][]){
			long C[][] = new long[2][2];
			for(int i = 0;i < 2;i++){
				for(int j = 0;j < 2;j++){
					for(int k = 0;k < 2;k++){
						C[i][k] = (C[i][k] + A[i][j] * B[k][j]) % MOD;
					}
				}
			}
			return C;
		}
		long[][] pow(long A[][],long n){
			long B[][] = new long[2][2];
			B[0][0] = 1;B[1][1] = 1;
			while(n > 0){
				long bool = n & 1;
//				System.out.println(bool);
				if(bool == 1)B = mul(A,B);
				A = mul(A,A);
				n >>= 1;
			}
			return B;
		}
		long solve(long cnt){
			long A[][] = new long [2][2];
			A[0][0] = 1;A[0][1] = 1;
			A[1][0] = 1;A[1][1] = 0;
			A = pow(A, cnt);
			return A[1][0];
		}
		void doIt(){
			int n = sc.nextInt();
			for(int i = 0;i < n;i++){
				int num = sc.nextInt();
				long cnt = sc.nextLong();
				System.out.println(num+" "+solve(cnt));
			}
		}
	}
}