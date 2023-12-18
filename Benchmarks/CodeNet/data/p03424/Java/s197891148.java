import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		boolean s[] = {false, false, false, false}; //P, W, G, Y
		String c;
		
		for(int i=0; i<N; i++) {
			c = sc.next();
			if("P".equals(c)) s[0] = true;
			else if("W".equals(c)) s[1] = true;
			else if("G".equals(c)) s[2] = true;
			else if("Y".equals(c)) s[3] = true;
			
			if(s[0] && s[1] && s[2] && s[3]) {
				sc.close();
				System.out.println("Four");
				return;
			}
		}
		sc.close();
		System.out.println("Three");
	}

}