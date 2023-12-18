import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char[] c = str.toCharArray();
		String ans = "Yes";

		for (int i=0; i < str.length(); i++) {
			if (i % 2 == 1) {
				if (c[i] != 'i') {
					ans = "No";
					break;
				}
			}
			if (i % 2 == 0) {
				if (c[i] != 'h' ) {
					ans = "No";
					break;
				}
			}
		}
		scan.close();
		System.out.println(ans);
	}
}
