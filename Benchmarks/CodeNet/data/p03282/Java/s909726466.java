import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		char[] S = str.toCharArray();
		long K = scn.nextLong();
		int ans = 0;
		for(int i = 0;i < str.length();i++) {
			if((S[i])=='1') {
				K--;
			}else{
				ans = i;
				break;
			}
			if(K==0) {
				ans = i;
				break;
			}
		}
		System.out.println(S[ans]);
		scn.close();
	}
}
