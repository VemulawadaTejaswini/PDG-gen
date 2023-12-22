import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main{
	public static void main(String[] args) throws IOException{
		Scanner stdIn=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		double r=stdIn.nextDouble();
		double s=r*r*Math.PI;
		double l=2*r*Math.PI;
		System.out.printf("%f %f\n", s,l);
	}
}