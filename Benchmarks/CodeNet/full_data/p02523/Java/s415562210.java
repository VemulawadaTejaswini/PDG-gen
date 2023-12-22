import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		double a = Double.parseDouble(st.nextToken());
		double b = Double.parseDouble(st.nextToken());
		double c = Double.parseDouble(st.nextToken());
		double d = Double.parseDouble(st.nextToken());
		
		System.out.printf("%.8f",Math.sqrt(Math.pow(c - a,2) + Math.pow(d - b,2)));
	}
	
}