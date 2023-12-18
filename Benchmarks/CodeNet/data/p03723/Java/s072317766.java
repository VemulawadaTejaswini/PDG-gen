import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	private BufferedReader br;
	private int a, b, c, count;
	private StringTokenizer st;
	private int[][] cook;
	private boolean Isloop;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		new Main().start();
	}

	private void start() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		cook = new int[2][3];
		cook[1][0] = a;
		cook[1][1] = b;
		cook[1][2] = c;
		count = 0;
		Isloop = false;
		while (true) {
			if (cook[1][0] % 2 == 1 || cook[1][1] % 2 == 1 || cook[1][2] % 2 == 1) {
				break;
			}
			cook[0][0] = (cook[1][1] / 2) + (cook[1][2] / 2);
			cook[0][1] = (cook[1][0] / 2) + (cook[1][2] / 2);
			cook[0][2] = (cook[1][1] / 2) + (cook[1][0] / 2);
			for (int i = 0; i < 3; i++) {
				cook[1][i] = cook[0][i];
			}
			if (cook[1][0] == a && cook[1][1] == b && cook[1][2] == c) {
				Isloop = true;
				break;
			}
			count++;
		}
		if (Isloop) {
			System.out.println("-1");
		} else {
			System.out.println(count);
		}
	}
}
