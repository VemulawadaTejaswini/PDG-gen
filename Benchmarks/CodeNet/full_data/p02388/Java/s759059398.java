import java.io.*;
public class Main {
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int x = Integer.parseInt(str);
		if(1<x & x<100) {
		  System.out.println(x*x*x);
		}
	}

}