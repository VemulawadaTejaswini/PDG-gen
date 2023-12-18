import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String S = sc.next(),T=sc.next();
		String ans="No";
		for(int i=0;i<S.length();i++) {
			if(S.equals(T)) {
				ans="Yes";
			}else {
				S=S.substring(S.length()-1,S.length())+S.substring(0,S.length()-1);
			}
		}
		System.out.println(ans);
	}
}