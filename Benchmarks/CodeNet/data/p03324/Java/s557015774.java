import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int n=sc.nextInt();
        if(d>=0 && d<=2){
            int t=(int)Math.pow(100,d);
            System.out.println(t*n);
        }
	}
}