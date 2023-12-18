import java.util.*;
public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 
		String s = sc.next();
		for (int i = 0; i < s.length() -  1; i++) {
			char c1 = s.charAt(i);
			char c2 = s.charAt(i+1);
		
			if (c1 == c2) {
				System.out.println((i + 1) + " " + (i + 2));
				return;
			} else {
				for (int j = i; j < s.length() - 2; j+=2) {
				
					char c3 = s.charAt(j);
					char c4 = s.charAt(j+2);
					if (c3 == c4) {
						System.out.println((j + 1) + " " + (j + 3));
						return;
					}
				}
			}
		}
		System.out.println("-1 -1");
	}
}