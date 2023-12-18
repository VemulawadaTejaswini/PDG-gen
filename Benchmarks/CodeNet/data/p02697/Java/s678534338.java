import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		StringTokenizer st = new StringTokenizer(bf.readLine());
 		int a = Integer.parseInt(st.nextToken());
 		int b = Integer.parseInt(st.nextToken());
 		double phi = (1.0+Math.sqrt(5.0))/2.0;
 		double phi2 = phi*phi;
 		for(int i = 1;i<=b;i++){
 			int p1 = (int)(Math.floor(i*phi))%a;
 			if (p1 ==0)
 				p1+=a;
 			
 			int p2 = (int)(Math.floor(i*phi2))%a;
 			if (p2 == 0)
 				p2+=a;
 			out.println(p1 + " " + p2);
 		}
 		out.close();
 		
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


