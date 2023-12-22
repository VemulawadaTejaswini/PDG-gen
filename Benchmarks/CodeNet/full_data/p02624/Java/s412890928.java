import java.util.Scanner;
import java.util.*; 
public class Main {
	
	static final int MAXN = 10000001; 
    
    // stores smallest prime factor for every number 
    static int spf[] = new int[MAXN]; 
       
    // Calculating SPF (Smallest Prime Factor) for every 
    // number till MAXN. 
    // Time Complexity : O(nloglogn) 
    static void sieve() 
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
       
    // A O(log n) function returning primefactorization 
    // by dividing by smallest prime factor at every step 
    static HashMap<Integer, Integer> getFactorization(int x) 
    { 
        HashMap<Integer, Integer> ret = new HashMap<>(); 
        while (x != 1) 
        { 	
        	if(ret.containsKey(spf[x]))
        		ret.put(spf[x], ret.get(spf[x]) + 1); 
        	else
        		ret.put(spf[x], 1); 
        	x = x / spf[x]; 
        } 
        return ret; 
    } 
	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		sieve();
		
		long ans = 0;
		
		for(int i=1;i<n+1;i++)
		{
			HashMap<Integer, Integer> mp = getFactorization(i);
			long facs = 1;
			for (Map.Entry me : mp.entrySet())
			{
				facs*=((int)me.getValue() + 1);
			}
			ans+=(facs*i);
		}
		System.out.println(ans);
		
	}

}
