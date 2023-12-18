import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.nextLine();
		s = s.trim();
		int m;
		boolean b = false;
		if(n % 2 == 0) {
			m = n/2;
			String s2 = s.substring(0,m-1);
			String s3 = s.substring(m,n-1);
			if(s2.equals(s3)) {
				b = true;
			}
		}
		if(b) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
