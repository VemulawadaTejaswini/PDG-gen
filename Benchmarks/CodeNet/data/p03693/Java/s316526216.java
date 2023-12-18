import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static int r;
	static int g;
	static int b;
	static int rgb;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] param = line.split(" ");

		String s = param[0];
		String s2 = param[1];
		String s3 = param[2];
		
		r = 100 * Integer.parseInt(param[0]);
		g = 10 * Integer.parseInt(param[1]);
		b = Integer.parseInt(param[2]);
		rgb = r + g + b;
		
		if( (rgb % 4) == 0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

	}
