import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] S = sc.next().toCharArray();
		char[] k = "CODEFESTIVAL2016".toCharArray();
		int cnt = 0;
		for(int i = 0; i < 16; i++) {
			if(S[i] != k[i]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
