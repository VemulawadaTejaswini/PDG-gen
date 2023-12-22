import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double x,y;
		while(br.readLine() != null){
			String[] num = br.readLine().split(" ");
			double a = Double.parseDouble(num[0]);
			double b = Double.parseDouble(num[1]);
			double c = Double.parseDouble(num[2]);
			double d = Double.parseDouble(num[3]);
			double e = Double.parseDouble(num[4]);
			double f = Double.parseDouble(num[5]);
			
			x=(f*b-c*e)/(d*b-a*e);
			y=(-a*x+c)/b;
		
			System.out.println(x+" "+y);
		}
	}
}
		