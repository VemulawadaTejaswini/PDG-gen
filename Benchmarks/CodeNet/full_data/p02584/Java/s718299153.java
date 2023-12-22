import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 
 		StringTokenizer st = new StringTokenizer(bf.readLine());
 		long x = Long.parseLong(st.nextToken());
 		long k = Long.parseLong(st.nextToken());
 		long d = Long.parseLong(st.nextToken());
	 	if (sign(x) == -1 && sign(x) == sign(x+k*d))
	 		out.println(Math.abs(x+k*d));
	 	else if (sign(x) == 1 && sign(x) == sign(x-k*d))
	 		out.println(Math.abs(x-k*d));
	 	else{
	 		if (k%2 == 1)
	 			x-=d;
	 		out.println(Math.min(Math.abs((x%(2*d)+2*d)%(2*d)), Math.abs((x%(2*d)+(2*d))%(2*d)-2*d)));
	 	}

 		
 		
 		out.println();
	 		
 		out.close();
 		
 		
 		
 	}
	public static int sign(long j){
		if (j < 0)
			return -1;
		else
			return 1;
	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


