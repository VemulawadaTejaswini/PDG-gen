import java.io.*;

class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double r = Double.parseDouble(br.readLine());
		double l, S;
		
		l = 2 * Math.PI * r;
		S = Math.PI * r * r;
		System.out.println(S + " " + l);
	}