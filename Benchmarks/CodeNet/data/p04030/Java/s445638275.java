import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuilder str = new StringBuilder();

		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='B') {
				if(str.length()!=0) {
					str.deleteCharAt(str.length()-1);
				}
			}else {
				str.append(s.charAt(i));
			}
		}
		System.out.println(str);
		/*if(N!=0) {
			System.out.println("Yes");//Yes or YES注意！！
		}else {
			System.out.println("No");//No or NO注意！！
		}*/

	}
	public static int sample(int n) {
		return n;
	}

}
