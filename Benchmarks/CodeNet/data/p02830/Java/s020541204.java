import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] S = sc.next().split("");
		String[] T = sc.next().split("");
		sc.close();
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i < N;i++){
			sb.append(S[i]);
			sb.append(T[i]);
		}
		System.out.println(sb.toString());
	}
}