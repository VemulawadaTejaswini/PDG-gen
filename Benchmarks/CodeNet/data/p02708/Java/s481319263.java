import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		long num = 1000000007;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		StringTokenizer st = new StringTokenizer(bf.readLine());
 		int n = Integer.parseInt(st.nextToken());
 		int k = Integer.parseInt(st.nextToken());
 		long sum = 0;
 		for(long j = k;j<=n;j++){
 			sum+=(long)((j*(long)(n)-j*j+j+1));
 			sum%= num;
 		}
 		
 		
 		out.println(sum+1);
	 		
 		out.close();
 		
 		
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


