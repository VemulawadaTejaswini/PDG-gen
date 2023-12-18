import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		
		StringBuilder sb = new StringBuilder();
		for(int i = A;i < A+K;++i) {
			sb.append(i);
			sb.append('\n');
		}
		for(int i = B-K+1;i <= B;++i) {
			sb.append(i);
			sb.append('\n');
		}
		System.out.println(sb.toString());
	}
}
