import java.util.Scanner;

public class  Main{
	public static int[] dif(int[] x){
		int[] ans = new int[x.length-1];
		for(int i = 0; i < ans.length; i++){
			ans[i] = x[i+1]-x[i];
		}
		return ans;
	}
	
	public static int solve(int[] x, int K){
		if( K > x.length ){
			return 0;
		}
		for(int i = 0; i < x.length; i++){
			int max = i;
			for(int j = i+1; j < x.length; j++){
				if( x[j] > x[max] ){
					max = j;
				}
			}
			int temp = x[max];
			x[max] = x[i];
			x[i] = temp;
		}
		int sum = 0;
		for(int i = K-1; i < x.length; i++){
			sum += x[i];
		}
		return sum;
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int T = stdIn.nextInt();
		int[] result = new int[T];
		for(int i = 0; i < T; i++){
			int N = stdIn.nextInt(), K = stdIn.nextInt();
			int[] x = new int[N];
			for(int j = 0; j < N; j++){
				x[j] = stdIn.nextInt();
			}
			result[i] = solve(dif(x), K);
		}
		for(int i = 0; i < T; i++){
			System.out.println(result[i]);
		}
	}
}