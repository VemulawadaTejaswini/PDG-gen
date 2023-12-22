import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader rg=new BufferedReader(new InputStreamReader(System.in));
		String s=rg.readLine();
		double r=Double.parseDouble(s);
		System.out.println(r*r*Math.PI+" "+2*r*Math.PI);
	}
}