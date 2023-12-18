import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int G = sc.nextInt();
		int B = sc.nextInt();
		int N = sc.nextInt();
		int ans = 0;
		int sum = 0;
		for(int r = 0; r * R <= N; r++) {
			sum = r * R;
			for(int g = 0; r * R + g * G <= N; g++) {
				sum = r * R + g * G;
				for(int b = 0; r * R + g * G + b * B <= N; b++) {
					sum = r * R + g * G + b * B;
					if(sum == N) ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
