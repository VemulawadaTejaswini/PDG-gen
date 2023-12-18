
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int K = sc.nextInt();
		char tmp = S.charAt(0);

		int checkflag = 0;
		if(S.length()>=3) {
			char last1 = S.charAt(S.length()-1);
			char s2 = S.charAt(1);
			if((tmp == last1) && (last1 == s2)) {
				checkflag = 1;
			}
		}
		long count = 0;
		for(int i = 1; i < S.length();i++) {
			if(tmp == S.charAt(i)) {
				count++;
				tmp = '0';
			}else {
				tmp = S.charAt(i);
			}
		}
		if(checkflag == 1) {
			count = count * K - (K-1);
		}else {
			count = count * K;
		}
		System.out.println(count);
	}

}

