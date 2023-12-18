/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

public class Main {
	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,s,i;
        n=sc.nextInt();
        s=sc.nextInt();
        // no=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }Arrays.sort(a);
        int nm=n-s;
        i=0;
        long ans=0;
        while(nm>0)
        {
            ans+=a[i];
            i++;
            nm--;
        }
        System.out.println(ans);
        
        
	}
}