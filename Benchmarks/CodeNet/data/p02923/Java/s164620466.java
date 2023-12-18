import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] H = new long[N];
		for (int i = 0; i < H.length; i++)
			H[i] = sc.nextLong();
		int ans = 0;
		for (int i = 0; i < H.length; i++) {
			int count = 0;
			for (int j = i + 1; j < H.length; j++) {
				if (H[j - 1] >= H[j])
					count++;
				else
					break;
			}
			if (ans < count)
				ans = count;
		}
		System.out.println(ans);
		sc.close();
	}
}