import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		sc.close();
		
		for(int l = 2; l <= s.length(); l++) {
			for(int i = 0; i <= s.length() - l; i++) {
				int[] c = new int[26];
				for(int j = 0; j < l; j++) {
					c[s.charAt(i+j) - 97]++;	
				}
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