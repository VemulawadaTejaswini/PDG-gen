
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int N = 0, maxGCD = 0, gcd = 0, median;

		try (Scanner scanner = new Scanner(System.in)) {

			N = scanner.nextInt();
			int[] value = new int[N];
			int[] gcds = new int[N-1];

			for (int i = 0; i < N; i++) {
				value[i] = scanner.nextInt();
			}

			for (int i = 0; i < N; i++) {
				for (int j = i + 1; j < N; j++) {
					gcd = gcd(value[i], value[j]);
					maxGCD = Math.max(maxGCD, gcd);
					gcds[i] = maxGCD;
				}
			}

			median = median(gcds);
			
			if (median == maxGCD) {
				System.out.println(maxGCD);
			} else {
				System.out.println(gcd(maxGCD, median));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// https://atcoder.jp/contests/agc018/submissions/1450553
	static int gcd(int x,int y)
	{
		return y>0?gcd(y,x%y):x;
	}
	
	public static int median(int[] m) {
	    int middle = m.length/2;
	    if (m.length%2 == 1) {
	        return m[middle];
	    } else {
	        return (m[middle-1] + m[middle]) / 2;
	    }
	}
	
}
