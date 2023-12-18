import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int count = 0;
		int ans = 0;
		for (int i = 0; i < M; i++) {
			count += sc.nextInt();
		}
		if (count <= N) {
			ans = N - count;
		} else {
			ans = -1;
		}
		System.out.println(ans);
	}
}