import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//
		//        int a = scan.nextInt();
		//        int b = scan.nextInt();
		//        int c = scan.nextInt();

		String s = scan.next();
		char[] c = s.toCharArray();

		int cunt = 0;

	//	for (int i = 0; i < c.length; i++) {
			if (c[0] == '1') // looking for 'a' only
				cunt++;
			if (c[1] == '1')
				cunt++;
			if (c[2] == '1') {
				cunt++;
			}
		//}
		System.out.println(cunt);

	}
}