import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		StringTokenizer st = new StringTokenizer(bf.readLine());
 		int n = Integer.parseInt(st.nextToken());
 		int d = Integer.parseInt(st.nextToken());
 		int count = 0;
 		for(int i = 0;i<n;i++){
//	 		String input1 = bf.readLine().trim();
//	 		String input2 = bf.readLine().trim();
	 		StringTokenizer st1 = new StringTokenizer(bf.readLine());
	 		int x1 = Integer.parseInt(st1.nextToken());
	 		int y1 = Integer.parseInt(st1.nextToken());
	 		if ((long)(x1)* (long)(x1) + (long)(y1)*(long)(y1) <= (long)(d)*(long)(d))
	 			count++;
 		}
 		
 		
 		out.println(
 				count);
	 		
 		out.close();
 		
 		
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


