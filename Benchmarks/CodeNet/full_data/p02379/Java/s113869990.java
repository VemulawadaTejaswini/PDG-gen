import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			String[] line = br.readLine().split(" ");
			int x1 = Integer.parseInt(line[0]);
			int y1 = Integer.parseInt(line[1]);
			int x2 = Integer.parseInt(line[2]);
			int y2 = Integer.parseInt(line[3]);

			int diffX = Math.abs(x1 - x2);
			int diffY = Math.abs(y1 - y2);
			int z = diffX * diffX + diffY * diffY;
			System.out.println(String.format("%.5f", Math.sqrt(z)));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}