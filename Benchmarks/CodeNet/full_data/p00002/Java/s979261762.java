import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String s = r.readLine();
		StringTokenizer st = new StringTokenizer(s," ");
		int a,b,t;
		while(true){
			a = Integer.parseInt(st.nextToken().toString());
			b = Integer.parseInt(st.nextToken().toString());
			a+=b;
			for(t=0;a!=0;a=a/10)t++;
			System.out.println(t);
			s = r.readLine();
			st = new StringTokenizer(s," ");
		}
	}
}