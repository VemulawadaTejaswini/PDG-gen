
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str);

		System.out.println(math(n));
	}
	static int math(int n){
		for(int i = n ; 1 < i ; i--) {

			if (i == 0){
				break;
			}

			n *= (i-1);
		}
		return n;
	}
}