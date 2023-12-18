import java.util.*;

class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	int a = 0;
	int z = 0;
	for(int i=0; i<s.length();i++) {
		if(s.charAt(i) == 'A') {
			a = i;
			break;
		}
	}
	for(int j=1; j<=s.length(); j++) {
		if(s.charAt(s.length() - j) == 'Z') {
			z = s.length() - j;
			break;
		}
	}
	System.out.println(z-a+1);
	}
}