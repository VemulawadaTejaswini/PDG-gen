import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		StringTokenizer st = new StringTokenizer(bf.readLine());
 		long a = Long.parseLong(st.nextToken());
 		long b = Long.parseLong(st.nextToken());
 		long n = Long.parseLong(st.nextToken());
 		long x = n/b*b-1;
 		if (x == -1){
 			x = n;
 		}
 		long ans = Math.floorDiv(a*x, b) - a*Math.floorDiv(x,b);
 		
 		
 		out.println(ans);
	 		
 		out.close();
 		
 		
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


