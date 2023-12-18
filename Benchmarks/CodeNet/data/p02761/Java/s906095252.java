
import java.io.*;
import java.util.*;

public class Main {
	public static void main (String[] args) {
	Scanner s=new Scanner(System.in);	
	int n=s.nextInt();
	int m=s.nextInt();
	int a[]=new int[n];
	boolean flag=true;
	for(int i=0;i<n;i++)
	a[i]=-1;
	for(int i=0;i<m;i++)
	{int p=s.nextInt();
	int q=s.nextInt();
	if(a[p-1]!=-1 && a[p-1]!=q)
	flag=false;
	else
	a[p-1]=q;}
	if(a[0]<=0)
	flag=false;
	if(flag==false)
	System.out.println("-1");
	else
	{for(int i=0;i<n;i++)
	{System.out.print(a[i]);}}
	}}