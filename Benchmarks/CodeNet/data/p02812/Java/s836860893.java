
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();
		int count = 0;

		for(int i=0 ; i<=s.length()-3 ; i++) {
			if(s.charAt(i)=='A' && s.charAt(i+1)=='B' && s.charAt(i+2)=='C') {
				count++;
			}
		}

		System.out.println(count);

		sc.close();

	}

}
