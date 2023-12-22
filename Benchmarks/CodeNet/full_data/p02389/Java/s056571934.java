import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
	    String[] array = str.split(" ");
		int a = Integer.parseInt(array[0]);
		int b = Integer.parseInt(array[1]);
		System.out.println(a*b+" "+(2*a+2*b));
	}
}