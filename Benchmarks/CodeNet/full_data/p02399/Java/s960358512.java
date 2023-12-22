import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");
    int a = Integer.parseInt(line[0]);
		int b = Integer.parseInt(line[1]);
		double fa = Integer.parseInt(line[0]);
		double fb = Integer.parseInt(line[1]);
		int d = a/b;
		int r = a%b;
		double f = fa/fb;
		System.out.printf(d + " " + r + " " + "%5.5f",f);
	}
}