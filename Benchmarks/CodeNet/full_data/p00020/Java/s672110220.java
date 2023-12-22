import java.io.*;
import java.util.Scanner;

class capitalize{
	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		String s;
		String u;
		s = input.readLine();
		u = s.toUpperCase();
		System.out.println(u);
	}
}