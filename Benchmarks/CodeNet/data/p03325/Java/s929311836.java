import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		String[] strA = sc.nextLine().split(" ");
		int ans = 0;
		for(int i=0; i<N; i++) {
			ans += half(Integer.parseInt(strA[i]), 0);
		}
		System.out.println(ans);
		sc.close();
	}

	private static int half(int num, int count) {
		if(num % 2 == 0) {
			count++;
			count = half(num / 2, count);
		}
		return count;
	}
}