import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int l = s.length();
		char[] Odds = new char[l];

		for(int i=0; i<l; i++) {
			Odds[i] = s.charAt(i);
			if(i%2==0) {
				System.out.print(Odds[i]);
			}
		}

	}

}
