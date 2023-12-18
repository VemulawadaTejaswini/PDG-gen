import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		String s = sc.next();

		int blackcount = 0;
		int whitecount = 0;
		boolean found  = false;

		for (int i = 0; i < n; i++) {
			if (found) {
				if (s.charAt(i) == '#') {
					blackcount++;
				} else {
					whitecount++;
				}
			} else {
				if (s.charAt(i) == '#') {
					found = true;
					blackcount++;
				}
			}
		}

		System.out.println(Math.min(blackcount, whitecount));

		sc.close();
	}

}
