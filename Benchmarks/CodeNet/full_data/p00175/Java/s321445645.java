import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		StringBuffer s;
		
		while (true) {
			n = sc.nextInt();
			if (n == -1) {
				break;
			}
			
			s = new StringBuffer("");
			while (true) {
				s.append(Integer.toString(n % 4));
				n /= 4;
				if (n == 0) {
					break;
				}
			}
			System.out.println(s.reverse());
		}
	}
}