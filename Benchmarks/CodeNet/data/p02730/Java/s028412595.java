import java.util.*;
class Main {

	public static Boolean process(String s) {
		int i = 0, j = s.length() - 1;
		while(i < j) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		String s1 = s.substring(0, ((n-1)/2));
		String s2 = s.substring((n+3)/2 - 1, n);

		if(process(s) && process(s1) && process(s2)) {
			System.out.println("Yes");	
		}
		else {
			System.out.println("No");
		}
	}
}