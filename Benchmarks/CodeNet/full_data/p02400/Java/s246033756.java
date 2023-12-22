
//Computation - Circle
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		double r = Double.parseDouble(in.readLine());
		
		System.out.println(2*r*Math.PI + " " +r*r*Math.PI);
			

	}



}