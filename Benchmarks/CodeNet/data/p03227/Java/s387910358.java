import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char S[] = new char[4], tmp;
		S = sc.next().toCharArray();
		sc.close();
		if (S.length == 3) {
			tmp = S[0];
			S[0] = S[2];
			S[2] = tmp;
		}
		System.out.print(S);
	}
}