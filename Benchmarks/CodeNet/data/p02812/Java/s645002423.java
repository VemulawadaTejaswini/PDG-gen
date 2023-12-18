import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String str = scan.nextLine();
		str = scan.nextLine();
		scan.close();

		char[] c = str.toCharArray();
		int ans = 0;
		int flg = 0;
		for (int i=0; i < n; i++) {
			if (c[i] == 'A') {
				flg =1;
			} else if (flg == 1 && c[i] == 'B') {
				flg =2;
			} else if (flg == 2 && c[i] == 'C') {
				ans +=1;
				flg = 0;
			} else {
				flg = 0;
			}
		}
		System.out.println(ans);
	}
}
