import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			while (true) {
				String s = reader.readLine();
				String[] a = s.split(" ");
				
				int W = Integer.parseInt(a[0]);
				int H = Integer.parseInt(a[1]);
				
				if (W == 0 && H == 0) {
					break;
				}
				
				for (int i = 0; i < H; i++) {
					for (int j = 0; j < W; j++) {
						System.out.print("#");
					}
					System.out.println();
				}
				System.out.println();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}