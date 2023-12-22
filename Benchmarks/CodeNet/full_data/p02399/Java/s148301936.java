//A / B Problem
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String[] ab = in.readLine().split(" ");
		int a = Integer.parseInt(ab[0]);
		int b = Integer.parseInt(ab[1]);

//		int a= 100;
//		int b =23;

		int d = a/b;
		int r = a%b;
//		double f =((int)(((double)a/(double)b)*10000))/10000;
		double f = ((double)((int)(((double)a/(double)b)*100000)))/100000;
		System.out.println(d+" "+r+" "+f);



	}
}