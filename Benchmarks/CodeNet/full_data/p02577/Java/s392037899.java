/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.math.BigInteger; 
import java.util.Scanner; 
public class Main
{
    /*
    static String getSum(BigInteger N) 
    { 
        // Initialize result 
       BigInteger f = new BigInteger("0"); // Or BigInteger.ONE 
  
        // Multiply f with 2, 3, ...N 
        while(N.compareTo(BigInteger.valueOf(0))!=0)
        {
            f=(f.add(N.remainder(10))).remainder(9);
            N=N.divide(10);
        }
        string s;
        if(((f.remainder(9)).compareTo(0))==0)
         s="Yes";
        else s="No";
        return s; 
    } 
    */
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        BigInteger N = new BigInteger(sc.next());
        BigInteger f = new BigInteger("0"); // Or BigInteger.ONE 
  
        // Multiply f with 2, 3, ...N 
        /*
        while(N.compareTo(BigInteger.valueOf(0))!=0)
        {
            f=(f.add(N.remainder(BigInteger.valueOf(10)))).remainder(BigInteger.valueOf(9));
            N=N.divide(BigInteger.valueOf(10));
        }
        */
        String s;
        if(((N.remainder(BigInteger.valueOf(9))).compareTo(BigInteger.valueOf(0)))==0)
         s="Yes";
        else s="No";
	//	System.out.println(getSum(n)); 
	System.out.println(s); 
	}
}
