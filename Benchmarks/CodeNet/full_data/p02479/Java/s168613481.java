import java.io.*;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		double x = Double.parseDouble(s);
		double r = Math.PI*x*x;
		double t = 2*Math.PI*x;
		System.out.printf("%6f %6f",r,t);
	}
}