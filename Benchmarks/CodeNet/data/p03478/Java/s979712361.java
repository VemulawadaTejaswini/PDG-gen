import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		int count = 0;
		for(int i=1; i<=N; i++) {
			int[] sum = new int[4];
			sum[0] = i/1000;
			sum[1] = (i-sum[0]*1000)/100;
			sum[2] = (i-(sum[0]*1000) - (sum[1]*100))/10;
			sum[3] = (i-(sum[0]*1000) - (sum[1]*100) - sum[2]*10);

			int s = sum[0] + sum[1] + sum[2] + sum[3];

			if(s >= A && s <= B) {
				count+= i;
			}
		}

		System.out.println(count);
	}

	public static void print(Object o) {
		System.out.print(o);
	}

	public static void println(Object o) {
		System.out.println(o);
	}
}