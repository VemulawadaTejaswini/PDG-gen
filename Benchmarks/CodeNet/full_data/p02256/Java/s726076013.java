import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arrays = br.readLine().split(" ");
		
		int x = Integer.parseInt(arrays[0]);
		int y = Integer.parseInt(arrays[1]);
		
		if(x > y){
			System.out.println(gcd(x, y));
		}
		else {
			System.out.println(gcd(y, x));
		}

	}
	static int gcd(int x, int y) {

		if (y == 0) {
			return x;
		} else {
			return gcd(y, x % y);

		}

	}
}