import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		
		String[] str = new String[6];
		
		int a, b, c, d, e, f;
		
		BufferedReader r = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String s = r.readLine();
		
		str = s.split(" ");
		
		a= Integer.parseInt(str[0]);
		
		b= Integer.parseInt(str[1]);
		
		c= Integer.parseInt(str[2]);
		
		d= Integer.parseInt(str[3]);
		
		e= Integer.parseInt(str[4]);
		
		f= Integer.parseInt(str[5]);
		
		
		double x = (c*e-b*f)/(a*e-b*d);
		double y = (a*f-c*d)/(a*e-b*d);
		System.out.println(x+" "+y);
	}
}