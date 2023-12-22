import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
		int x = Integer.parseInt(br.readLine());
		int t = 0, h = 0;
		for (int i = 0; i < x; i++) {
			String str=br.readLine();
			String[] fight=str.split(" ");			
			if (fight[0].charAt(0) == fight[1].charAt(0)) {
				t++;
				h++;
			} else if (fight[0].charAt(0) > fight[1].charAt(0))
				t += 3;
			else
				h += 3;
		}
		System.out.printf("%d %d%n",t,h);

	}

}