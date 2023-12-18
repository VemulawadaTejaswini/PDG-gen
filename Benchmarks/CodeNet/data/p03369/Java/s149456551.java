import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		int ramen = 700;
		char[] ch = S.toCharArray();
		for(int i = 0;i < ch.length;i++) {
			if(ch[i] == 'o') {
				ramen += 100;
			}
		}
		System.out.println(ramen);
	}
}