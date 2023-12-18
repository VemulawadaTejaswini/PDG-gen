import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		long[] map = new long[N];
		for (int i = 0; i < N; i++) {
			map[i] = sc.nextLong();
		}
		
		Arrays.sort(map);
		
		long a = 0;
		for (int i = map.length - 1; i > 0; i--) {
			if (map[i] == map[i - 1]) {
				a = map[i];
				map[i] = -1;
				map[i - 1] = -2;
				break;
			}
		}
		
		Arrays.sort(map);
		
		long b = 0;
		for (int i = map.length - 1; i > 0; i--) {
			if (map[i] == map[i - 1]) {
				b = map[i];
				break;
			}
		}
		
		long ans = a * b;
		System.out.println(ans);
	}
}