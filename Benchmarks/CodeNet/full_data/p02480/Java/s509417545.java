import java.io.*;
public class Main{
	public static void main(String[] args){
		
InputStreamReader is = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(is);

        String str = br.readLine();
		
		int x = Integer.parseInt(str);
		
		System.out.println(x*x*x);
	}
}