import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	static final int MAXN = 10000001; 
    
    static int spf[] = new int[MAXN]; 
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
	
		sieve();
		
		int n=s.nextInt();
		
		long ans=0;
		
		for(int i=1;i<=n;i++)
		{
			HashMap<Integer,Long> map=new HashMap<>();
			
			int temp=i;
			
			while(temp>1)
			{
				
				if(map.containsKey(spf[temp]))
				{
					map.put(spf[temp],map.get(spf[temp])+1);
				}
				else
				{
					map.put(spf[temp],1l);
				}
				
				temp=temp/spf[temp];
			}
			
			long count=1;
			
			for(Map.Entry<Integer,Long> entry:map.entrySet())
			{
				count=count*(entry.getValue()+1);
			}
			
			ans=ans+(i*count);
		}
		
		System.out.println(ans);
		
	}
	
	public static void sieve() 
    { 
        spf[1] = 1; 
        for (int i=2; i<MAXN; i++) 
       
            // marking smallest prime factor for every 
            // number to be itself. 
            spf[i] = i; 
       
        // separately marking spf for every even 
        // number as 2 
        for (int i=4; i<MAXN; i+=2) 
            spf[i] = 2; 
       
        for (int i=3; i*i<MAXN; i++) 
        { 
            // checking if i is prime 
            if (spf[i] == i) 
            { 
                // marking SPF for all numbers divisible by i 
                for (int j=i*i; j<MAXN; j+=i) 
       
                    // marking spf[j] if it is not  
                    // previously marked 
                    if (spf[j]==j) 
                        spf[j] = i; 
            } 
        } 
    } 
	
}