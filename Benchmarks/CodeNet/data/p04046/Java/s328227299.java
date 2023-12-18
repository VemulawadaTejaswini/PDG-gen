import java.util.Scanner;

/**
 * 大岩達典 J4-170821<br>
 * D-いろはちゃんとます目<br>
 * https://beta.atcoder.jp/contests/abc042/tasks/arc058_b
 * <br>
 * 教壇から見て左中央<br>
 * <br>
 */
public class Main {
	
	public static final int MAX = 1000000007;
	public static short[] FRACTION;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		final int height = scanner.nextInt();
		final int width = scanner.nextInt();
		final int bottom = scanner.nextInt();
		final int left = scanner.nextInt();
		scanner.close();
		initFrac(height*width);
		
		int result = 0;
		
		for (int i = left; i < width;i++) {
			result += (combination(height-bottom-1, i) * combination(bottom-1, width-i-1));
			//System.out.println(String.format("(%d,%d),(%d,%d)", height-bottom-1, i, bottom-1, width-i-1));
		}
		System.out.println(result);
	}
	
	public static int combination(int a, int b) {
		return fraction(a+b) / fraction(a) / fraction(b);
	}
	
	public static int fraction(int a) {
		return FRACTION[a];
	}
	
	public static void initFrac(int max) {
		FRACTION = new short[max];
		short prev = 1;
		FRACTION[0] = prev;
		for (int i = 1; i < FRACTION.length; i++) {
			prev *= i;
			FRACTION[i] = prev;
		}
	}
}
