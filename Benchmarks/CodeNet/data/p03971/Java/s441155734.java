import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		String s = sc.next();
		
		int pass = 0;
		int oversea_pass = 0;
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == 'c') {
				System.out.println("No");
				continue;
			}
			if(ch == 'a') {
				if(pass < a + b) {
					System.out.println("Yes");
					pass++;
				}
				else
					System.out.println("No");
				continue;
			}
			if(ch == 'b') {
				if(pass >= a + b) 
					System.out.println("No");
				else {
					if(oversea_pass < b) {
						System.out.println("Yes");
						pass++;
						oversea_pass++;
					}
					else
						System.out.println("No");
				}
			}
		}
		
	}

}
