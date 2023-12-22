import java.util.Arrays;
import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int[] sum;
	static int n;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		n = sc.nextInt();
		if(n == 0)return false;
		
		sum = new int[n];
		int score = 0;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < 5; j++){
				score += sc.nextInt();
			}
			sum[i] = score;
			score = 0;
		}
		
		return true;
	}
	
	static void solve(){
		Arrays.sort(sum);
		System.out.println(sum[sum.length-1] + " " + sum[0]);
	}
}