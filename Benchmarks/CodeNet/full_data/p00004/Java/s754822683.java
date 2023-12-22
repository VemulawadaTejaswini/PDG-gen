import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double x,y;
		String ln;
		while((ln=br.readLine()) != null){
			
			String[] num = ln.split(" ");
			int a = Integer.parseInt(num[0]);
			int b = Integer.parseInt(num[1]);
			int c = Integer.parseInt(num[2]);
			int d = Integer.parseInt(num[3]);
			int e = Integer.parseInt(num[4]);
			int f = Integer.parseInt(num[5]);
			
			y=(double)(a*f-d*c)/(a*e-b*d);
			x=(double)(-b*y+c)/a;
		
			System.out.printf("%.3f %.3f\n",x,y);
		}
	}
}
		