import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br =	new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] number = line.split(" ");	//半角スペースで分割

		int n = Integer.parseInt(number[1]+number[2]);

		if(n % 4 == 0){
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

}
