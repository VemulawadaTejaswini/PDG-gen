import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		for(int i = 1 ; i <= B ; i++) {
			if(A % (B * i) == C) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}
}
