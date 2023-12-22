import java.util.*;
//import java.io.*;
//import static java.util.Arrays.*;
//import static java.util.Collections.*;
//import static java.lang.Math.*;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
        int a,b,c,n,i,q,j,k;
        k=0;
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        int s[]=new int [n];
        for(i=0;i<n;i++)
        {
        	s[i]=scan.nextInt();
        }
        q=scan.nextInt();
        int t[]=new int [q];
        for(j=0;j<q;j++)
        {
        	t[j]=scan.nextInt();
        }
        for(j=0;j<q;j++)
        {
        a=0;
        b=n;
        while(a<b)
        {
        	c=(a+b)/2;
        	if(s[c]==t[j])
        	{
        		k++;
        		a=b+1;
        	}
        	else if(s[c]>t[j])
        	{
        		b=c;
        	}
        	else
        	{
        		a=c+1;
        	}
        }
        }
        System.out.println(k);
	}

}