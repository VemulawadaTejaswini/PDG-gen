import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		int scoreh = 0;
		int scorek = 0;

		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		String str1;
		str1=br.readLine();
		String[] sp1 = str1.split(" ");

		int h1 = Integer.parseInt(sp1[0]);
		int h2 = Integer.parseInt(sp1[1]);

		String str2;
		str2=br.readLine();
		String[] sp2 = str2.split(" ");

		int k1 = Integer.parseInt(sp2[0]);
		int k2 = Integer.parseInt(sp2[1]);

		String str3;
		str3=br.readLine();
		String[] sp3 = str3.split(" ");

		int a = Integer.parseInt(sp3[0]);
		int b = Integer.parseInt(sp3[1]);
		int c = Integer.parseInt(sp3[2]);
		int d = Integer.parseInt(sp3[3]);

		scoreh = h1 * a + h2 * b + (h1 / 10) * c + (h2 / 10) * d;
		scorek = k1 * a + k2 * b + (k1 / 10) * c + (k2 / 10) * d;

		if(scoreh > scorek){
			System.out.println("hiroshi");
		} else if(scoreh < scorek){
			System.out.println("kenjiro");
		} else{
			System.out.println("even");
		}
	}
}