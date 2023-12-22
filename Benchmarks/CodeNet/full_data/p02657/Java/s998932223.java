import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] lo =reader.readLine().split(" ");
		int a = Integer.parseInt(lo[0]);
		int b = Integer.parseInt(lo[1]);
		System.out.println(a*b);
	}
}
