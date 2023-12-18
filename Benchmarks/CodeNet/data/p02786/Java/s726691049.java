import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long h = sc.nextLong();
		long cnt = 0;
		while (h > 0) {
			h /= 2;
			cnt++;
		}
		
		long ans = (long) Math.pow(2, cnt) - 1;
		System.out.println(ans);
	}
}
