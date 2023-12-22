import java.io.*;
import java.util.*;

class Main{
	
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		String[] num = line.split(" ");
		int a = Integer.parseInt(num[0]);
		int b = Integer.parseInt(num[1]);
		
		int d = a/b;
		int r = a%b;
		String f = (String.format("%.5f",a/b));
		
		sb.append(d).append(" ").append(r).append(" ").append(f).append("\n");
		System.out.print(sb);
	}
}