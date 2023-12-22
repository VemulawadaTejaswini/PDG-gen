import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ideone {

	public static void main(String[] args) {
		try (BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
			String line;
			int[] top3 = new int[3];
			while ((line = r.readLine()) != null) {
				int val = Integer.parseInt(line);
				if (top3[0] <= val) {
					top3[2] = top3[1];
					top3[1] = top3[0];
					top3[0] = val;
				} else if (top3[1] <= val) {
					top3[2] = top3[1];
					top3[1] = val;
				} else if (top3[2] <= val) {
					top3[2] = val;
				}
			}

			for (int t : top3) {
				System.out.println(t);
			}
		} catch (Exception e) {
			e.getStackTrace();
			System.exit(-1); // プログラムを終了
		}
	}
}