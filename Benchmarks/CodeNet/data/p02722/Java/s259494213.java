/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    static Set<Long> set=new HashSet<Long>();
    static int div(long n) 
    { 
        int cnt=0;
        for (long i=1; i<=Math.sqrt(n); i++) 
        { 
            if (n%i==0) 
            { 
                if (n/i == i){ 
                    if(!set.contains(i)){
                        set.add(i);
                        cnt++;
                    }
                }
       
                else{ 
                    if(!set.contains(i)){
                        set.add(i);
                        cnt++;
                    }if(!set.contains(n/i)){
                        set.add(n/i);
                        cnt++;
                    }
                }
            } 
        }
        return cnt;
    } 
    
    static int pdiv(long n) 
    { 
        int ans=0;
        for (long i=1; i<=Math.sqrt(n); i++) 
        { 
            if (n%i==0) 
            { 
                if (n/i == i) {
                    long m=n;
                    if(!set.contains(i)){
                    while(m%i!=0)
                        m=m/i;
                    if(m==1)
                        ans++;
                    else if(m%i==1)
                        ans++;
                    set.add(i);
                    }
                }
            }        
       
                else 
                    {
                        if(!set.contains(n/i)){
                        long m=n/i;
                    while(m%i!=0)
                        m=m/i;
                    if(m==1)
                    ans++;
                    else if(m%i==1)
                    ans++;
                    set.add(n/i);
                    }
                    if(!set.contains(i)){
                        long m=n;
                    while(m%i!=0)
                        m=m/i;
                    if(m==1)
                    ans++;
                    else if(m%i==1)
                    ans++;
                    set.add(i);
                    }
            } 
        } 
        return ans;
    } 
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		int ans=0;
		ans+=div(n-1);
		ans+=pdiv(n);
		System.out.println(ans+1);
	}
}
