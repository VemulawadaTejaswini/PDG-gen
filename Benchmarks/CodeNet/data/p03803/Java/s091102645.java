import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) {

		try {
			// 標準入力
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String array[] = br.readLine().split(" ");

			int a = Integer.parseInt(array[0]);

			int b = Integer.parseInt(array[1]);

			if(a == b) {
				System.out.print("Draw");
			}else if(a == 1 || a > b) {
				System.out.print("Alice");
			}else{
				System.out.print("Bob");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
