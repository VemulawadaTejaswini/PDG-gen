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

		r = 100 * Integer.parseInt(s);
		g = 10 * Integer.parseInt(s2);
		b = Integer.parseInt(s3);
		rgb = r + g + b;
		if((r/100)<=9 & (r/100)>=1 & (g/10)>=1 & (g/10)<=9 & b >=1 & b <=9){

		if( (rgb % 4) == 0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		}else{
			System.out.println("No");
		}

	}
}