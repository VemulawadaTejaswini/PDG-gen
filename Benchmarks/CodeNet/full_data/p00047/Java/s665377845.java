import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static boolean[] cups;

	public static void swap (int a, int b) {
		boolean temp = cups[a];
		cups[a] = cups[b];
		cups[b] = temp;
	}

	public static int getNum (String str) {
		return str.equals("A") ? 0 : str.equals("B") ? 1 : 2;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		cups = new boolean[]{true,false,false};

		while ((line = br.readLine()) != null) {
			String[] str = line.split(",");
			int swap1 = getNum(str[0]);
			int swap2 = getNum(str[1]);
			swap(swap1, swap2);
			line = null;
		}
		for (int i = 0; i < cups.length; i++) {
			if (cups[i]) {
				switch (i) {
					case 0 : System.out.println("A"); break;
					case 1 : System.out.println("B"); break;
					case 2 : System.out.println("C"); break;
				}
			}
		}

	}

}