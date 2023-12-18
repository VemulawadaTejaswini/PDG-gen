import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		scn.nextLine();
		char[] S = scn.nextLine().toCharArray();
		int ans = 1;
		for(int i = 1;i < N;i++) {
			if(S[i] != S[i-1])i++;
		}
		System.out.println(ans);
	}

}