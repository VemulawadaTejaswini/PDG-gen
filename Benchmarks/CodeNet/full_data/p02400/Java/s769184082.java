import java.io.*;
public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String str=input.readLine();
		int a=Integer.parseInt(str);
		double r=(double) a;
		System.out.println((String.format("%.6f",r*r*Math.PI))+" "+(String.format("%.6f",r*2*Math.PI)));
	}
}