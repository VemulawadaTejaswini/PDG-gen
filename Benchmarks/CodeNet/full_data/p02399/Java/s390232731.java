import java.io.*;
import java.util.*;

class Main{
	
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		StringTokenizer st = new StringTokenizer(line," ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int d = a/b;
		int r = a%b;
		float f = a/b;
		
		System.out.println(d +" "+ r +" "+ f);
	}
}