import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] substr = str.split(" ", 0);
		int n = Integer.parseInt(substr[0]);
		int kosuu = Integer.parseInt(substr[1]);

		str = scan.nextLine();
		substr = str.split(" ", 0);

		double ans = 0.0;
		int seikai = 0;
		for (int i=0; i<n-kosuu+1; i++) {
			double kouho = 0.0;
			for (int j=i; j<i+kosuu; j++) {
				kouho += Integer.parseInt(substr[j]);
			}
			if (ans < kouho) {
				ans = kouho;
				seikai = i;
			}
		}
		ans = 0;
		for (int i=seikai; i<seikai+kosuu; i++) {
			ans += kitaichi(Integer.parseInt(substr[i]));
		}

		System.out.printf("%.12f\n", ans);
	}

	public static double kitaichi(int a) {
		double ans = (a +1) * 0.5;
		return ans;
	}

}

