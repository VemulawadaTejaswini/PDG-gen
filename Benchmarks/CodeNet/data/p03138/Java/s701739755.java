import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long K = sc.nextLong();
		long[] map = new long[N];
		int[] bitCount = new int[40];
		for (int i = 0; i < N; i++) {
			long a = sc.nextLong();
			map[i] = a;
			String bin = Long.toBinaryString(a);
			int count = 0;
			for (int j = bin.length()-1; 0 <= j; j--) {
				if (bin.charAt(j) == '1') {
					bitCount[count]++;
				}
				
				count++;
			}
		}
		
		long base = N / 2 + (N % 2);
		
		long f = 0;
		for (int i = 0; i < 40; i++) {
			if (bitCount[i] < base) {
				f += Math.pow(2, i);
				if (f > K) {
					f -= Math.pow(2, i);
					break;
				}
			}
		}
		
		long ans = 0;
		for (int i = 0; i < N; i++) {
			ans += map[i]^f;
		}
		
		System.out.println(ans);
	}
}