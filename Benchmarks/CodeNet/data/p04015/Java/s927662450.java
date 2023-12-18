import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N = keyboard.nextInt();
		int A = keyboard.nextInt();
		int[] in = new int[N];
		for(int i=0; i < N; i++) {
			in[i] = keyboard.nextInt();
		}
		
		for (int i = 0; i < N; i++) {
			in[i] -= A;
		}
		
		long[][] masu = new long[51][5001];
		
		masu[0][2500] = 1;
		
		for(int j = 1; j < N+1; j++) {
			for(int k = 0; k < 5001; k++) {
				if(k-in[j-1] >= 0 && k-in[j-1] <= 5000) {
				masu[j][k] += masu[j-1][k-in[j-1]];
				masu[j][k] += masu[j-1][k];
				}
			}
		}
			
		System.out.println(masu[N][2500]-1);
		keyboard.close();
	}
}