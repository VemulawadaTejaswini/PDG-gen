import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int X = Integer.parseInt(br.readLine());
		
		int ans = 0;
		while(true) {
			if(X >= 500) {
				ans += X / 500 * 1000;
				X %= 500;
			} else {
				ans += X / 5 * 5;
				X %= 5;
			}
			
			if(X < 5)
				break;
		}
			
		System.out.println(ans);
	}

}