import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			int i = 1;
			while (true) {
				String str = reader.readLine();
				String[] arr = str.split(" ");
				int x = Integer.parseInt(arr[0]);
				int y = Integer.parseInt(arr[1]);
				int temp;
				
				if (x > y) {
					temp = x;
					x = y;
					y = temp;
				}
				
				if (x == 0 && y == 0) {
					break;
				}
				System.out.println(x + " " + y);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}