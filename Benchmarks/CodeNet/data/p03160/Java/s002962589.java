import java.util.*;
import java.io.*;

class Main{
  public static int mod(int a, int b){
  	return a>b?a-b:b-a;
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in); 
	int n=sc.nextInt();
    int[] arr=new int[n];
    int[] cost=new int[n];
    
    for(int i=0;i<n;i++){
        	arr[i]=sc.nextInt();
    }
    cost[0]=0;
    cost[1]=mod(arr[0],arr[1]);
    for(int i=2;i<n;i++){
    	cost[i]=Math.min(cost[i-1]+mod(arr[i-1],arr[i]),cost[i-2]+mod(arr[i-2],arr[i]));
    }
    System.out.println(cost[n-1]);
  }
       }