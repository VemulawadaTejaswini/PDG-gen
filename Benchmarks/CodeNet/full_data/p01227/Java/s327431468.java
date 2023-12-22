import java.util.Scanner;

public class  Main{
	public static int solve(int[] x, int K, int len){
		if( K > x.length ){
			return 0;
		}
		int sum = 0;
		if( x.length/2 > K ){
			for(int i = 0; i < K-1; i++){
				int max = i;
				for(int j = i+1; j < x.length; j++){
					if( x[j] > x[max] ){
						max = j;
					}
				}
				int temp = x[max];
				x[max] = x[i];
				x[i] = temp;
				sum += x[i];
			}
			return len-sum;
		} else {
			for(int i = 0; i < x.length-K+1; i++){
				int min = i;
				for(int j = i+1; j < x.length; j++){
					if( x[j] < x[min] ){
						min = j;
					}
				}
				int temp = x[min];
				x[min] = x[i];
				x[i] = temp;
				sum += x[i];
			}
			return sum;
		}
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int T = stdIn.nextInt();
		int[] result = new int[T];
		for(int i = 0; i < T; i++){
			int N = stdIn.nextInt(), K = stdIn.nextInt();
			int[] x = new int[N];
			
			x[0] = stdIn.nextInt();
			int[] dif = new int[x.length-1];
			for(int j = 1; j < N; j++){
				x[j] = stdIn.nextInt();
				dif[j-1] = x[j]-x[j-1];
			}
			int len = x[N-1]-x[0];
			result[i] = solve(dif, K, len);
		}
		for(int i = 0; i < T; i++){
			System.out.println(result[i]);
		}
	}
}