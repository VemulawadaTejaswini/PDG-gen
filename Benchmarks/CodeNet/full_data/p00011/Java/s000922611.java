import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();
		int[] ab = new int[N];
		for(int i = 0; i < N; i++) ab[i] = i+1;
		for(int i = 0; i < W; i++) {
			int a, b, tmp = 0;
			String[] s = sc.next().split(",");
			a = Integer.parseInt(s[0]) - 1;
			b = Integer.parseInt(s[1]) - 1;
			tmp = ab[a]; ab[a] = ab[b]; ab[b] = tmp;
		}
		for(int i = 0; i < N; i++) {
			System.out.println(ab[i]);
		}
	}
}