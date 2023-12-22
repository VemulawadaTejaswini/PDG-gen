import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int meter, rotate, deg = 90;
		double x = 0, y = 0;
		String str, buf[] = new String[2];
		while((str = br.readLine()) != null){
			buf = str.split(",");

			meter = Integer.parseInt(buf[0]);
			rotate = Integer.parseInt(buf[1]);

			if(meter == 0 && rotate == 0)break;

			x += meter * Math.cos(Math.toRadians(deg));
			y += meter * Math.sin(Math.toRadians(deg));

			deg -= rotate;
		}
		System.out.println((int) x);
		System.out.println((int) y);
	}

}