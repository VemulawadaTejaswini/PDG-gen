import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		String strArray[] = str.split(" ", 0);

		float a = Integer.parseInt(strArray[0]);
		float b = Integer.parseInt(strArray[1]);

		int d = (int)a / (int)b;
		int r = (int)a % (int)b;
		float f = a / b;

		System.out.println(d + " " + r + " " + f);
	}

}