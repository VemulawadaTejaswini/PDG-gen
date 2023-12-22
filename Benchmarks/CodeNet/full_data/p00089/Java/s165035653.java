import java.util.Scanner;

public class Main {
	private Scanner sc;

	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		int[] prev = {0};
		int[] next = {0};
		while (sc.hasNextLine()) {
			String[] nico = sc.nextLine().split(",");

			next = new int[nico.length];
			int[] num = new int[nico.length];
			for (int i = 0; i < nico.length; i++) {
				num[i] = Integer.parseInt(nico[i]);
				next[i] = 0;
			}

			for (int i = 0; i < nico.length; i++) {
				if (prev.length <= next.length) {
					if (i == 0) next[i] = prev[i] + num[i];
					else if (i == prev.length) next[i] = prev[i - 1] + num[i];
					else next[i] = num[i] + Math.max(prev[i], prev[i + 1]);
				} else {
					next[i] = num[i] + Math.max(prev[i], prev[i + 1]);
				}
			}
		}
		
		System.out.println(next[0]);
	}
}