import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] vis = new int[2000001];
		int N = input.nextInt();
		int cnt = 0;
		for (int i = 1; i <= N; i++) {
			int x = input.nextInt();
			if (i+x<=200000) vis[i+x]++;
			if (i-x>=0) cnt+=vis[i-x];
		} 
		System.out.println(cnt);
	}
}