import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] S = sc.next().toCharArray();
		S[3] = '8';
		System.out.println(String.valueOf(S));
	}
}


