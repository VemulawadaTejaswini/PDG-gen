import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String str = "";
			for (;;) {
				String input = reader.readLine();
				String[] array = input.split(" ");
				int m = Integer.parseInt(array[0]);
				int f = Integer.parseInt(array[1]);
				int r = Integer.parseInt(array[2]);
				int sum = m + f;
			
				if (m == -1 && f == -1 && r == -1) {
					break;
				} else if (m == -1 || f == -1) {
					System.out.print("F");
				} else if (sum >= 80 ) {
					System.out.print("A");
				} else if (sum >= 65 && sum < 80) {
					System.out.print("B");
				} else if (sum >= 50 && sum < 65) {
					System.out.print("C");
				} else if (sum >= 30 && sum < 50) {
					if (r >= 50) {
						System.out.print("C");
					} else {
						System.out.print("D");
					}
				} else if (sum < 30) {
					System.out.print("F");
				}
				System.out.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}