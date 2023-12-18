import java.util.Arrays;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		
		long[] map = new long[26];
		for (int i = 0; i < N; i++) {
			char S = sc.nextLine().charAt(0);
			switch(S) {
				case 'M':
				case 'A':
				case 'R':
				case 'C':
				case 'H':
					map[(int) S - 65] += 1;
					break;
				default:
					break;
			}
		}
		
		Arrays.sort(map);
		long[] march = Arrays.copyOfRange(map, 21, 26);
		
		long ans = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = i + 1; j < 4; j++) {
				for (int k = j + 1; k < 5; k++) {
					ans += march[i] * march[j] * march[k];
				}
			}
		}
		
		System.out.println(ans);
	}
}