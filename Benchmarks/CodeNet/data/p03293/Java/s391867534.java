import java.io.*;
import java.util.*;
import java.math.*;
class Main
{ 
	public static int M = 1000000007;
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String s1 = br.readLine();	
        String s2 = br.readLine();
        int f=0, len = s1.length();
        for(int i=0;i<len;i++)
        {
            if(checker(s1,s2,i,0))
            {
                f=1;
                break;
            }
        }
        if(f==1)
            out.println("Yes");
        else
            out.println("No");
        out.flush();
    }
    public static boolean checker(String s1, String s2, int pos1, int pos2)
    {
        int count=0,len = s1.length();

        while(count<len)
        {
            if(s1.charAt(pos1)==s2.charAt(pos2))
            {
                pos1=(pos1+1)%len;
                pos2=(pos2+1)%len;
                count++;
            }
            else
                return false;
        }
        return true;
    }
    /** Loops
    *	i: for(int i=0;i<n;i++)
    *	j: for(int j=0;j<n;j++)
    *	k: for(int k=0;k<n;k++)

    *	ArrayList<Integer> arr1 = new ArrayList<>();
    
    * 	HashMap
    *	HashMap<Integer, Integer> hm = new HashMap<>();
    * 	for (Map.Entry<String,String> entry : hm.entrySet()) 
    		out.println(entry.getValue());
    
    *	Count frequencies
    	for(int i=0;i<n;i++)
        {
            Integer c = hm.get(Integer.parseInt(s[i]));
            if(c==null)
                hm.put(Integer.parseInt(s[i]),1);
            else
                hm.put(Integer.parseInt(s[i]),++c);
        }
	**/		
    public static long modularExpo(long x,long n,int M)
	{
		long result=1;
		while(n>0)
		{
		    if(n%2==1)
		        result=(result*x)%M;
		    x=(x*x)%M;
		    n=n/2;
		}	
		return result;												
	}
	//FLT, only when a and M are co-prime
	public static long modInverse(int a,int M)
	{
		long g = gcd(a,M);
		if(g!=1)
			return -1;
	    return modularExpo(a,M-2,M);
	}
	public static long gcd(int a, int b) 
	{
	    if(b==0)
	        return a;
	    else
	        return gcd(b, a % b);
	}
}