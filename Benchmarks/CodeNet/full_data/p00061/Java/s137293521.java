import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] data = new int[101];
		String sdata;
		int[] use = new int[31];
		while (!"0,0".equals(sdata = in.next())) {
			int team = Integer.parseInt(sdata.substring(0, sdata.indexOf(',')));
			int point = Integer
					.parseInt(sdata.substring(sdata.indexOf(',') + 1));
			data[team] = point;
			if (use[point] == 0) {
				use[point] = 1;
			}
		}
		int rank = 1;
		for (int i = 30; i >= 0; i--) {
			if (use[i] == 1) {
				use[i] = rank++;
			}
		}
		while (in.hasNext()) {
			System.out.println(use[data[in.nextInt()]]);
		}
	}
}