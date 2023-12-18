import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		sc.close();
		
		if(s.length() == 2) {
			if(s.charAt(0) == s.charAt(1)) {
				System.out.println("1 2");
				return;
			} else {
				System.out.println("-1 -1");
				return;
			}
		}
		
		for(int l = 3; l <= s.length(); l += 2) {
			int[] c = new int[26];
			for(int j = 0; j < l; j++) {
				c[s.charAt(j) - 97]++;	
			}
			for(int m = 0; m < c.length; m++) {
				if(c[m] > l/2) {
					System.out.println("1 " + l);
					return;
				}
			}
			
			for(int i = l; i < s.length(); i++) {
				c[s.charAt(i-l) - 97]--;
				c[s.charAt(i) - 97]++;
				for(int m = 0; m < c.length; m++) {
					if(c[m] > l/2) {
						System.out.println((i+1) + " " + (i+l));
						return;
					}
				}
			}		
		}
		
		System.out.println("-1 -1");
		return;
	}
	
}