import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int K = sc.nextInt();
		char tmp = S.charAt(0);

		int checkflag = 0;
		if((S.length()>=3) && (K>1)) {
			char last1 = S.charAt(S.length()-1);
			char last2 = S.charAt(S.length()-2);
			char last3 = S.charAt(S.length()-3);
			//char first2 = S.charAt(1);
			if(last1 == tmp){
				if((last1 == last2)&&(last2==last3) ) {
					checkflag=1;
				}
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
			count = count * K + (K-1);
		}else {
			count = count * K;
		}
		System.out.println(count);
	}

}

