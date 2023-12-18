import java.util.Scanner;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] map = new int[N];
		int sum = 0;
		for (int i = 0; i < N; i++) {
			map[i] = sc.nextInt();
			sum += map[i];
		}
		
		int ave = Math.round((float)sum / (float)N);
		
		long ans = 0;
		for (int i = 0; i < N; i++) {
			ans += (map[i] - ave) * (map[i] - ave);
		}
		
		System.out.println(ans);
	}
}