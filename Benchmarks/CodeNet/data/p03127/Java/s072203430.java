import java.util.Scanner;

//Scanner sc = new Scanner(System.in);

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[][] R = new int[N][N];
		for(int i = 0; i < N; i++){
			A[i] = sc.nextInt();
		}
		

		
		int min = (int)Math.pow(10, 9);
		for(int i = 0; i < N; i++){
			for(int j = 0; j < N; j++){
				int m = getMin(A[i], A[j]);
				min = min > m ? m : min;
			}
		}
//		
//	
		System.out.println(min);
	}
	
	static int getMin(int a, int b){
		if(a == b || b == 0) return a;
		int big = a > b ? a : b;
		int small = a > b ? b : a;
		int mod = big % small;
		if(mod < small){
			big = small;
			small = mod;
			return getMin(big, small);
		}else
			return small;
	}
}
