import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		double r = Integer.parseInt(br.readLine());
		if((0 < r) && (r <= 10000)){
			double f = ((double)(r * r)* 3.14f);
			double d = ((double)(r * 2)* 3.14f);

			System.out.printf("%05f %05f",f , d);
		}
	}
}