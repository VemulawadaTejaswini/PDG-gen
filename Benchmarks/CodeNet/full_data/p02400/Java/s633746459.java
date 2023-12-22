import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circle {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double r=Integer.parseInt(br.readLine());

		double x=Math.PI;

		double menseki=r*r*x;
		double gaisyu=2*x*r;

		System.out.println(menseki+" "+gaisyu);
	}

}
