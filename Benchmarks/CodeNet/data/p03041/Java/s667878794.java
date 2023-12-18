
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		sc.close();

		for(int i=0; i<n; i++) {
			if(i+1==k) {
				System.out.print(Character.toLowerCase(s.charAt(i)));
			}else {
				System.out.print(s.charAt(i));
			}
		}

	}

}
