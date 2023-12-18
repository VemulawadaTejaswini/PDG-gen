import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		long mod = (long)(1e9+7);
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int K = input.nextInt();
		boolean[] vis = new boolean[N+1];
		int answer = N;
		for (int i = 0; i < K; i++) {
			int num = input.nextInt();
			for (int j = 0; j < num; j++) {
				int snuke = input.nextInt();
				if (!vis[snuke]) {
					answer--;
					vis[snuke]=true;
				}
			}
		}
		System.out.println(answer);
	}
}