import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = new String[1];
		int x, y, temp;
		
		LOOP : do {
			str = br.readLine().split("\\s+");
			
			if (str.length > 1) {
				try {
					x = Integer.parseInt(str[0]);
					y = Integer.parseInt(str[1]);
				
					if (x == 0 && y == 0) break LOOP;
					
					if (x > y) {
						temp = x;
						x = y;
						y = temp;
					}
					
					System.out.println(x + " " + y);

				} catch (Exception NumberFormatException) {
					continue LOOP;
				}
			}
		} while (true);
	}
}