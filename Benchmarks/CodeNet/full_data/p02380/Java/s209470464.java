import java.io.*;

public class Main{
	public static void main(String[] arsg) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str[] = new String[4];
		str = br.readLine().split(" ");
		
		double a = Double.parseDouble(str[0]);
		double b = Double.parseDouble(str[1]);
		double C = Double.parseDouble(str[2]);
		
		double sin = Math.sin(Math.toRadians(C));
		double S = a*b*sin/2;
		
		double c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2)-2*a*b*Math.cos(Math.toRadians(C)));
		
		double length = a + b + c;
		
		double height = b*Math.sin(Math.toRadians(C));
		System.out.println(S);
		System.out.println(length);
		System.out.println(height);
	}
}