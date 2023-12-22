// Java program to find large factorials using BigInteger 
import java.math.BigInteger; 
import java.util.Scanner; 
  
public class Solution 
{ 
    // Returns Factorial of N 

  
    // Driver method 
    public static void main(String args[]) throws Exception 
    { 
        //int N = 20; 
        //System.out.println(factorial(N)); 
        int t;
        Scanner myObj = new Scanner(System.in); 
        t=myObj.nextInt();
        BigInteger ar[]=new BigInteger[t];
        int t1=0;
        for(int i=0;i<t;i++)
        {
            String s;
            s=myObj.next();
            BigInteger n=new BigInteger(s);
            if(n.compareTo(new BigInteger("0"))==0)
            {
                t1=1;
            }
            ar[i]=n;
        }
        BigInteger ans=new BigInteger("1");
        BigInteger m=new BigInteger("1000000000000000000");
        for(int i=0;i<t;i++)
        {
            ans=ans.multiply(ar[i]);
            if(m.compareTo(ans)<0)
            {
                ans=new BigInteger("-1");
                break;
            }
        }
        System.out.println(ans);
        
        
    } 
} 