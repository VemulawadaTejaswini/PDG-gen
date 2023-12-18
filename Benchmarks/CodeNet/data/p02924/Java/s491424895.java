import java.util.*;
import java.lang.Math; 

public class Main
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
		long n =scan.nextInt();
		int m = n*(n-1)/2;
		System.out.println(m);
    }
}