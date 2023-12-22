import java.util.Scanner;

public class Problem2639 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int t = 0;

		/*
		 * 
		 * [0 << 50 >> 50] 40 [90 << 50 >> 140] 50 [190 << 5 >> 95] 40 [135 <<5>> 140] 40 [180 <<5>> 185]
		 *                 51        111

		 * [0 << 5 >> 5] 40 [45 << 5 >> 50] 40 [90 << 5 >> 95] 40 [135 <<5>> 140] 40 [180 <<5>> 185]
		 *               29                 89                                    149
		 */
		while (t < Integer.MAX_VALUE - 120) {
			int w1 = t;
			int w2 = t + a;
			int r = t / 60;
			int arrive = 60 * r + c;
//			System.out.printf("%d <--> %d, r = %d, arrive = %d\n", new Object[] { new Integer(w1), new Integer(w2), new Integer(r), new Integer(arrive) });

			if (w1 <= arrive && arrive <= w2) {
				System.out.println(arrive);
				return;
			}

			t += a + b;
		}
		
		System.out.println(-1);
	}
}