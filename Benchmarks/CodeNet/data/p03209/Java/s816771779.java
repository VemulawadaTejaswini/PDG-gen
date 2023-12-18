import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int X = sc.nextInt();
		String burger[] = new String[N+1];
		burger[0] = "P";

		int i = 0;

		while (i <= N-1) {
			burger[i+1] = "B" + burger[i] + "P" + burger[i] + "B";
			i++;
		}

		String BURGER = burger[N].substring(0, X);

		String[] burg = new String[BURGER.length()];
		int ans = 0;

		for (int j = 0; j < BURGER.length(); j++) {
		    burg[j] = String.valueOf(BURGER.charAt(j));
		    if (burg[j].equals("P")) {
		    	ans++;
		    }
		}
		System.out.println(ans);
	}
}