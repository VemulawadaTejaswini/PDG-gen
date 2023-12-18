import java.util.*;
public class Main{
	public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    	long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        double asq = Math.sqrt(a);
        double bsq = Math.sqrt(b);
        double csq = Math.sqrt(c);
        if(asq+bsq < csq)
        	System.out.println("Yes");
        else
       		System.out.println("No");
    }
}