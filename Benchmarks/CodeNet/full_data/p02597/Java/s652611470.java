import java.util.Scanner;

public class Main {
	static int check(boolean[] c) {
		for (int i = 0; i < c.length; i++) {
			if (c[i]) {
				return i;
			}
		}
		
		return -1;
	}
	
	static int check2(boolean[] c) {
		for (int i = c.length - 1; i > 0; i--) {
			if (!c[i] && c[i - 1]) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] c = new boolean[n];
		String str = sc.next();
		for (int i = 0; i < n; i++) {
			if (str.charAt(i) == 'W') {
				c[i] = true;
			}
		}
		
		int index = 0;
		int index2 = 0;
		
		int count = 0;
		
		while ((index = check2(c)) >= 0) {
			++count;
			index2 = check(c);
			
			if (index2 < 0) {
				break;
			}
			
			if (index > index2) {
				c[index] = !c[index];
				c[index2] = !c[index2];
			} else {
				break;
			}
		}
		System.out.println(count);
	}
}
