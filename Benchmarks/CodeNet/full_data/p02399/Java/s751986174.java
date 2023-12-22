
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputNum = br.readLine().split(" ");
		int a = Integer.parseInt(inputNum[0]);
		int b = Integer.parseInt(inputNum[1]);

		int d = a/b;
		int r = a%b;
		double f = (double)a/b;

		DecimalFormat dmmft = new DecimalFormat("0.00000");
		System.out.println(d + " " +  r  + " " + dmmft.format(f) );


	}

}