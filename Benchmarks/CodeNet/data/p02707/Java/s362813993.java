import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line1 = br.readLine();
		String line2 = br.readLine();
		int counts = Integer.parseInt(line1.split(" ")[0]);
		int[] bossCount = new int[counts];
		String[] bosses = line2.split(" ");
		for(int i = 0; i < counts; i++) {
			bossCount[i] = 0;
		}
		for(int i = 0; i < bosses.length; i++) {
			int index = Integer.parseInt(bosses[i]);
			bossCount[index] += 1;
		}
		StringBuilder sb = new StringBuilder();
		for (int i : bossCount) {
			sb.append(i);
			sb.append(" ");
		}
		System.out.println(sb.deleteCharAt(sb.length()).toString());
	}
}
