import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder output = new StringBuilder();
			String lb = System.getProperty("line.separator");
			
			int n = Integer.parseInt(input.readLine());
			String[] line1 = input.readLine().split(" ");
			String[] line2 = input.readLine().split(" ");
			int[] dist = new int[n];
			for (int i = 0; i < n; i++) {
				final int x = Integer.parseInt(line1[i]);
				final int y = Integer.parseInt(line2[i]);
				dist[i] = x > y ? x-y : y-x;
			}
			input.close();
			
			output.append(String.valueOf(minkowski(dist, 1))).append(lb)
				.append(String.valueOf(minkowski(dist, 2))).append(lb)
				.append(String.valueOf(minkowski(dist, 3))).append(lb)
				.append(String.valueOf(minkowski(dist, 0))).append(lb);
			
			System.out.print(output);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static double minkowski(int[] seq, double p) {
		double minkowski;
		if (p == 0) {
			minkowski = seq[0];
			for (int i = 1; i < seq.length; i++) {
				if (minkowski < seq[i]) {
					minkowski = seq[i];
				}
			}
		} else if (p == 1) {
			minkowski = 0;
			for (int i = 0; i < seq.length; i++) {
				minkowski += seq[i];
			}
		} else {
			minkowski = 0;
			for (int i = 0; i < seq.length; i++) {
				minkowski += Math.pow(seq[i], p);
			}
			minkowski = Math.pow(minkowski, 1/p);
		}
		return minkowski;
	}
}