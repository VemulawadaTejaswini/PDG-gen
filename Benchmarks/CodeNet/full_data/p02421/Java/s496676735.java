import java.util.Scanner;
public class Main {
	
	static char[] k = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int L = 0;
		int R = 0;
		for(int i = 0; i < n; i++) {
			String s1 = stdIn.next();
			String s2 = stdIn.next();
			
			if(s1.compareTo(s2) == 0) {
				L++;
				R++;
			}
			else if(s1.compareTo(s2) < 0) {
				L += 3;
			}
			else {
				R += 3;
			}
		}
		
		System.out.println(R + " " + L);
	}
}