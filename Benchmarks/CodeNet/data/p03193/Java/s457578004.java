import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String[] l = str.split(" ");
		int N = Integer.parseInt(l[0]);
		double H = Double.parseDouble(l[1]);
		double W = Double.parseDouble(l[2]);
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			str = s.nextLine();
			l = str.split(" ");
			double a = Double.parseDouble(l[0]);
			double b = Double.parseDouble(l[1]);
			if (a >= H && b >= W)
				cnt++;
		}
		System.out.println(cnt);
	}
}
