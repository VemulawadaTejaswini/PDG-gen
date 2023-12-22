import java.io.*;

public class Main{
	public static void main(String[] args){
		try{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String str = buf.readLine();
		double r = Double.parseDouble(str);
		double pi = Math.PI;
		double s = r*r*pi;
		double l = 2*r*pi;
		System.out.println(String.format("%.6f",s)+" "+String.format("%.6f",l));
		}catch(IOException e){

		}
	}

}