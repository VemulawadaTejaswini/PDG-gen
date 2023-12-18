import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String stN = Integer.toString(N);
		int L = stN.length();
		char c[] = new char[L];
		int cN[] = new int[L];
		int S = 0;
		for(int i = 0; i < L; i++) {
			c[i] = stN.charAt(i);
			cN[i] = (int)c[i];
			S = S + cN[i];
		}
		if(N%S == 0)System.out.println("yes");
		else System.out.println("no");
		}

}