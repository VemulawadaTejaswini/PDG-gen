import java.util.Scanner;

public class Main
{
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			sc.close();
			long ans = 0;
			for (int i=1; i <= n; i++) {
				if (i % 5 == 0 || i%3 ==0)  {
				} else {
					ans  += i;
				}
			}
			System.out.println(ans);
		}
}
