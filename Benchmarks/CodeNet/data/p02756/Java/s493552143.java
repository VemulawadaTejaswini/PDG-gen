import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String ans = scan.nextLine();
		int q = scan.nextInt();
		int invert = 1;
		for (int i = 0; i<q; i++) {
			String str = scan.nextLine();
			String[] substr = str.split(" ", 0);
			int a = Integer.parseInt(substr[0]);
			if (a == 1) {
				invert = invert * -1;
			} else {
				int b = Integer.parseInt(substr[1]);
				if (b == 1) {
					if (invert == 1) {
						ans = substr[2] + ans;
					} else {
						ans = ans + substr[2];
					}
				} else {
					if (invert == -1) {
						ans = substr[2] + ans;
					} else {
						ans = ans + substr[2];
					}
				}
			}
		}

		if (invert == -1) {
        StringBuffer str = new StringBuffer(ans);
        String hoge2 = str.reverse().toString();
        ans = hoge2;
		}

		scan.close();
		System.out.println(ans);
	}
}
