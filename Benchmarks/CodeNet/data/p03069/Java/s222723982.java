import java.util.Scanner;

// C - Stones
public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	String s = sc.next();
	String[] S = s.split("");
	int count = 0;

	for (int i = 0; i < N-1 /*最後の値はみない*/; i++) {
		if (S[i].equals("#") && S[i+1].equals(".")) {
			S[i+1] = "#";
			count++;
			i = 0;
		}
	}
	System.out.println(count);
	}
}