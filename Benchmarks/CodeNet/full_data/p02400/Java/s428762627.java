import java.io.*;

class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		double r = Integer.parseInt(str);
		double l, S;
		double pi = Math.PI;
		
		l = 2 * pi * r;
		S = pi * r * r;
		System.out.println(l + " " + S);
	}
}