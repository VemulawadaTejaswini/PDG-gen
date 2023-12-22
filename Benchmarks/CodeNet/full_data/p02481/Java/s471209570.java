import java.io.*;

public class Main{
	public static void main(String args[]) throws IOException {

		BufferedReader r=new BufferedReader(new InputStreamReader(System.in),1);
		
		int a=Integer.parseInt(r.readLine());
		int b=Integer.parseInt(r.readLine());
		
		a=a*b;
		
		System.out.println(a);
		
	}
}