import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		String strArray[] = str.split(" ", 0);

		int a = Integer.parseInt(strArray[0]);
		int b = Integer.parseInt(strArray[1]);

		int d = a / b;
		int r = a % b;
		double f = (double)a / (double)b;

		System.out.println(d + " " + r + " " + f);
	}

}