import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int num = 0;
		int ac = 0;
		int pe = 0;
		String s;
		String[] ans = new String[n + 1];

		for(int i = 0; i < m; i++) {
			num = sc.nextInt();
			s = sc.next();
			if(s.equals("AC")) {
				if(ans[num] == null || ans[num].equals("WA")) {
					ac++;
					ans[num] = "AC";
				}
			}else {
				if(ans[num] == null || ans[num].equals("WA")) {
					ans[num] = "WA";
					pe++;
				}
			}
		}

		System.out.println(ac + " " + pe);

		sc.close();
	}
}
