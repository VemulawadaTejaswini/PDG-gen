import java.io.*;
import java.util.*;

class Main{
	public static void main (String[] args) {
    	Scanner in=new Scanner(System.in);
    	int a[]=new int [3];
    	int n=in.nextInt();
    	int max=0;
    	for(int i=0;i<3;i++)  {
    	    a[i]=n%10;
    	    n=(n-(n%10))/10;
        }
        Arrays.sort(a);
        System.out.print(a[2]);
        System.out.print(a[2]);
        System.out.print(a[2]);
	}
}