import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int K	 = scn.nextInt();
		String S = scn.next();
		scn.close();
        int num = S.length();
		for(int j = 0 ; j <= S.length() ; j++) {
			if(S.isBlank()) {
				num += 1;
			}
		}
		if (num-1 <= K) {
			System.out.println(S);
		}else {
			String ans = S.substring(0,K);
			System.out.println(ans+"...");
		}
	}

}
