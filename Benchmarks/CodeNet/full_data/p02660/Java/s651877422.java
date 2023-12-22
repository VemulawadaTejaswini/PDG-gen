import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Long n=Long.parseLong(br.readLine().trim());
		System.out.println(algo(n));
		
		
	}

	public static long algo(long n)
	{
		long res=0;
		
		if(n==1)
		{
			return 0;
		}
		
		
		
		
		
		for(int i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				res++;
				n=n/i;
			}
		}
		
		
		return res;
		
		
	}
	
	
}
