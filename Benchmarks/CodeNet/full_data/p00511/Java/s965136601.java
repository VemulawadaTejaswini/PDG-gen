import java.util.*;

import javax.xml.crypto.Data;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		while(true) {
			char b = sc.next().charAt(0);
			if(b == '=') {
				System.out.println(a);
				break;
			}
			int c = sc.nextInt();
			if(b == '+') {
				a += c;
			}
			if(b == '-') {
				a -= c;
			}
			if(b == '*') {
				a *= c;
			}
			if(b == '/') {
				a /= c;
			}
		}
	}


}