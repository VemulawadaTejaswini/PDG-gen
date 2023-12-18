import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int a = Integer.parseInt(s);


		int p = 0;

		while(Math.pow(p, 2)<=a) {
			p++;
		}

		System.out.println(Math.pow(p-1, 2));


	}


}