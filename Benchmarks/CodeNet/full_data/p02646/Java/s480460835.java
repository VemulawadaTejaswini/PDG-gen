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
 		long v = Long.parseLong(st.nextToken());
 		StringTokenizer st1 = new StringTokenizer(bf.readLine());
 		long b = Long.parseLong(st1.nextToken());
 		long w = Long.parseLong(st1.nextToken());
 		long t = Long.parseLong(bf.readLine());
 		if (v <= w){
 			out.println("NO");
 			
 		}
 		else{
 			if ((Math.abs(b-a)+0.0)/(v-w+0.0) <=t)
 				out.println("YES");
 			else
 				out.println("NO");
 		}
 				
		
 		out.close();
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


