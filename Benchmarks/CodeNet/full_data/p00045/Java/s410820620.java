import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long cnt = 0;
		long sum1 = 0;
		long sum2 = 0;
		while(sc.hasNext()) {
			String[] s = sc.nextLine().split(",");
			cnt++;
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			sum1 += a * b;
			sum2 += b;
		}
		sc.close();
		long mean = (long)Math.round((double)sum2 / cnt);
		System.out.printf("%d\n%d\n", sum1, mean);
	}
}
