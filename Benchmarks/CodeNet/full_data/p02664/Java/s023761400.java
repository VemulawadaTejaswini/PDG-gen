import java.util.Scanner;

public class Main {
	static String T;
	static int n;
	static int m ;
	static int x;
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		T=sc.next();
		n=T.length();
		for(int a=0;a<n;a++) {
			if(T.substring(a).equals("D")) {
				m=0;
			}
			else if(T.substring(a).equals("P")) {
				m=1;
			}
			else if(T.substring(a).equals("?")) {
				T.replaceFirst("?","D" );
			}
		}
		System.out.println(T);
	}
}