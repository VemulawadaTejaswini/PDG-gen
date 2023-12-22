import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int a=0, b=0;
		double c=0, C=0, S=0, L=0, h=0;
		String[] data = in.readLine().split(" ");
		a = Integer.parseInt(data[0]);
		b = Integer.parseInt(data[1]);
		C = Math.toRadians(Integer.parseInt(data[2]));
		c = Math.sqrt((Math.pow(a, 2)+Math.pow(b, 2)-2*a*b*Math.cos(C)));
		System.out.println("c"+c);
		L = a+b+c;
		h = b*Math.sin(C);
		S = (a * h) / 2;
		System.out.println(S);
		System.out.println(L);
		System.out.println(h);

	}
}