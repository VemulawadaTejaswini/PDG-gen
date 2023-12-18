

import java.util.*;
public class Main
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int a=sc.nextInt();
  int b=sc.nextInt();
  int arr[]=new int[n+1];
  // int arr[][]=new int[n][n];
  // for(int i=0;i<n-1;i++){arr[i][i+1]=1;}
  	
  for(int i=0;i<n-1;i++)
  {
  	for(int j=i+1;j<n;j++)
  	{

  		int k1=i+1;
  		int j1=j+1;
  		if(k1<=a && j1>=b){arr[a-k1+1+j1-b]+=1;}
  			else if(k1<=a){arr[Math.min(j1-k1,b-j1+1+a-k1)]+=1;}
  			else if(k1>=a && j1<=b){arr[Math.min(j1-k1, k1-a+1+b-j1)]+=1;}
  			else if(k1>=a){arr[Math.min(j1-k1, j1-b+1+k1-a)]+=1;}
  			else{arr[j1-k1]+=1;}


  	}
  }
for(int i=1;i<n;i++){System.out.println(arr[i]);}
  }
}
