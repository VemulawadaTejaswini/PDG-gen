import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	int l = 1;
	int count = 1;
	String lw = String.valueOf(s.charAt(0));

	while(l < s.length()) {
		String a = String.valueOf(s.charAt(l));
		if((lw.length() > 1) || (lw.length() == 1 && !(lw.equals(a)))) {
			lw = a;
			l++;
			count++;
		}else {
			if(l != s.length()-1) {
				lw += String.valueOf(s.charAt(l+1));
				l += 2;
				count++;
			}else {
				l++;
			}
		}
	}

	System.out.println(count);
	sc.close();
	}
}