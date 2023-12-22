import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		String strArray[] = str.split(" ", 0);

		double a = Integer.parseInt(strArray[0]);
		double b = Integer.parseInt(strArray[1]);

		int d = (int)a / (int)b;
		int r = (int)a % (int)b;
		double f = a / b;

		System.out.println(d + " " + r + " " + f);
	}

}