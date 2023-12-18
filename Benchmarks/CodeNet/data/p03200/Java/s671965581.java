import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int count=0;
		int wc=0;
		int bc=0;
		char[] str=S.toCharArray();
		for(int i=0;i<S.length();i++) {
			if(str[i]=='B') {
				wc++;
			} else {
				count+=wc;
				bc++;
			}
		}
		System.out.println(count);

	}

}
