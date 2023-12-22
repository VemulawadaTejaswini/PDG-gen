import java.io.*;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] ab = br.readLine().split(" ");
		
		int a = Integer.parseInt(ab[0]);
		int b = Integer.parseInt(ab[1]);
		int d, r = 0;
		double f = 0;
		
		d = a/b;
		r = a%b;
		f = (double)a/b;
		
		System.out.println(d + " " + r + " " + f);
	}
}