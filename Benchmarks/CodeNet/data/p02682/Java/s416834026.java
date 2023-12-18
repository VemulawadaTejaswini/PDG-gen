import java.io.*;
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main
{	
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//long X=Long.parseLong(br.readLine());
		String []s=br.readLine().split(" ");
		long A=Long.parseLong(s[0]);
		long B=Long.parseLong(s[1]);
		long C=Long.parseLong(s[2]);
		long K=Long.parseLong(s[3]);
		
		long sum=0;
		boolean flag=true;
		
		if(K>A && flag==true)
		{
			K-=A;
			sum+=A;
			//out.println("if A K="+ K+" sum="+sum);
		}
		
		else if(K<=A && flag==true)
		{
			sum+=K;
			K=0;
			flag=false;
			//out.println("elif A K="+ K+" sum="+sum);
		}
		
		if(K>B &&  flag==true)
		{
			K-=B;
			//out.println("if B K="+ K+" sum="+sum);
		}
			
		else if(K<=B && flag==true)
		{
			K=0;
			flag=false;
			//out.println("elif B K="+ K+" sum="+sum);		
		}
		
		if(K>C && flag==true)
		{
			K-=C;
			sum-=C;
			//out.println("if C K="+ K+" sum="+sum);		
		}
		else if(K<=C && flag==true)
		{
			sum-=K;
			K=0;
			flag=false;
			//out.println("elif C K="+ K+" sum="+sum);		
		}
		
		
		//ans = flag==true? "Yes" : "No";
			
		out.println(sum);
		
	}
	
	
}


