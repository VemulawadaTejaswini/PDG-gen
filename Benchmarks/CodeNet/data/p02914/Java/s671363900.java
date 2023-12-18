import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {


	
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		
		ArrayList<Long> arr = new ArrayList<>();
		long res = 0l;
		for(int i = 0 ; i < n ; i++)
			arr.add(Long.parseLong(st1.nextToken()));
		
		  
			 
		for(int cnt = 113 ; cnt > 0 ; cnt--)
		{
			 int rand1 = (int)Math.random()*arr.size();
			 int rand2 = (int)Math.random()*arr.size();
			 
			 while(rand1 == rand2)
			 {
				 rand1 = (int)(Math.random()*arr.size());
				 rand2 = (int)(Math.random()*arr.size()); 
			 }
		
			 
			 
			 long yellow = arr.get(rand1) , red = arr.get(rand2);
			 
			 for(int i = 0 ; i < n ; i++)
			 {
				 if(i != rand1 && i  != rand2)
				 {
					 if((yellow^arr.get(i) - yellow) > (red^arr.get(i) - red))
						 yellow = yellow^arr.get(i);
					 else
						 red = red^arr.get(i);
				 }
			 }
			 res = Math.max(res, red + yellow);
		 
		}
		 out.println(res);
		out.flush();
		out.close();
	}
	
	
	


}
