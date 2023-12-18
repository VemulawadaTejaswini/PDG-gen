import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();
		char ans = '-';
		boolean flag = true;
		for(int i=0;i<s.length();i++) {
			if(i<a) {
				if(Character.isDigit(s.charAt(i))) {
					continue;
				}else {
					flag = false;
					break;
				}
			}else if(i == a) {
				if(ans == s.charAt(i)) {
					continue;
				}else {
					flag = false;
					break;
				}
			}else if(i<b) {
				if(Character.isDigit(s.charAt(i))) {
					continue;
				}else {
					flag = false;
					break;
				}
			}
		}
		if(flag) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}
		
	}
}
