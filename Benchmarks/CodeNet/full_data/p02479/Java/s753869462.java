import java.io.*;
import java.lang.Math;

class Main{

	public static void main(String args[]) throws IOException{
		double input;
		String str;
		BufferedReader br;
		
		br = new BufferedReader(new InputStreamReader(System.in));

		str = br.readLine();

		input = Double.parseDouble(str);

		System.out.println(input*input*Math.PI + " " + input*2.0*Math.PI);

	}

}