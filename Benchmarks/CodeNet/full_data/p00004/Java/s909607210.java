
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String argv[]) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String str;
		String Array[]=new String[6];
		double a,b,c,d,e,f,x,y;
		while ((str = br.readLine()) != null) {
			Array=str.split(" ");
			a = Double.parseDouble(Array[0]);
			b = Double.parseDouble(Array[1]);
			c = Double.parseDouble(Array[2]);
			d = Double.parseDouble(Array[3]);
			e = Double.parseDouble(Array[4]);
			f = Double.parseDouble(Array[5]);
			y=(c*d/a-f)/((b*d/a)-e);
			x=(c/a-b*y/a);
			System.out.printf("%.3f %.3f\n",x,y);

		}
	}

}