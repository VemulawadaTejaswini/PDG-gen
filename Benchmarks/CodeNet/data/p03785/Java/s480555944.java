import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int N = in.nextInt(), C = in.nextInt(), K = in.nextInt();
		int[] t = new int[N];
		for(int i = 0; i < N; i++){
			t[i] = in.nextInt();
		}
		Arrays.sort(t);

		int ans = 1, tt = 0, c = 0;
		for(int i = 0; i < N;i++){
			if(t[i] <= tt + K && c < C){
				c++;
			}else{
				tt += t[i];
				c = 1;
				ans++;
			}
		}
		System.out.println(ans);
	}
}