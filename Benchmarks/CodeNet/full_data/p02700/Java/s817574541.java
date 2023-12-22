import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		sc.close();
		String ans="No";
		while(true) {
			if (c-b>1) {
				c= c-b;
				if (d-a>1) {
					d=d-a;
				} else {
					ans = "Yes";
					break;
				}
			} else {
				break;
			}
		}
		System.out.println(ans);
	}
}
