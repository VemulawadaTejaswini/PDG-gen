import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void run() {
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			String num1 = sc.next();
			String num2 = sc.next();
			System.out.println(rev(add(rev(num1),rev(num2))));
		}
	}
	
	String rev(String str) {
		String rev = "";
		for(int i=str.length()-1;i>=0;i--)
			rev += str.charAt(i);
		return rev;
	}
	
	String add(String num1, String num2) {
		String n1,n2;
		if(num1.length()-num2.length()>0) { n1 = num1; n2 = num2; }
		else { n1 = num2; n2 = num1; }
		String num = "";
		int n = 0;
		
		for (int i=0;i<n2.length();i++) {
			num += ( n + (n1.charAt(i)-'0') + (n2.charAt(i)-'0') ) % 10;
			n = ( n + (n1.charAt(i)-'0') + (n2.charAt(i)-'0') ) / 10;
		}
		
		for (int i=n2.length();i<n1.length();i++) {
			num += ( n + (n1.charAt(i)-'0') ) % 10;
			n = ( n + (n1.charAt(i)-'0') ) / 10;
		}
		if(n == 1) num += 1;
		return num;
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
	
}