/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;


public class Main {
	public static void main (String[] args) {
// 		System.out.println("GfG!");
Scanner sc= new Scanner(System.in);
int n = sc.nextInt();
int m = sc.nextInt();
int ar[]=new int[n+1];
for(int i=0;i<n+1;i++)
ar[i]=-1;
boolean flag=true;

for(int i=0;i<m;i++){
    int pos = sc.nextInt();
    int val = sc.nextInt();
    pos--;
    if(ar[pos]==-1){
        ar[pos]=val;
    }
    else{
        if(ar[pos]!=val)
        flag= false;
    }
}

if(ar[0]==0)
flag = false;
if(ar[0]==-1)
ar[0]=1;

if(flag){
    String ans="";
    for(int i=0;i<n;i++)
{
    if(ar[i]==-1)
    ar[i]=0;
    ans+=ar[i];
    
}
System.out.println(ans);
    
}
else
System.out.println("-1");
	}
}