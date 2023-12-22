import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			String[] list = br.readLine().split(" ");
			int a = Integer.parseInt(list[0]);
			int b = Integer.parseInt(list[1]);
			int c = Integer.parseInt(list[2]);
			if (!(a >= b || b >= c)) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}