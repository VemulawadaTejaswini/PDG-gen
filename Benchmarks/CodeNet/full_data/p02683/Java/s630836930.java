import java.util.Arrays;
import java.util.Scanner;

public class Main{
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		 
		  int n=scn.nextInt();
		  int m =scn.nextInt();
		  int x =scn.nextInt();
		  int [][] arr =new int[n][m+1];
		//  int [] cost =new int [n];
		  for(int i=0;i<n;i++){
			//  cost[i]=scn.nextInt();
			  
			  for(int  j=0;j<m+1;j++){
				  arr[i][j]=scn.nextInt();
			  }
		  }
		//  min=Integer.MAX_VALUE;
		  int []arr1 =new int[m];
		 int ans =res(arr,arr1,0,x,0);
		  if(ans==Integer.MAX_VALUE){
			  System.out.println(-1);
			  return;
		  }
		  System.out.println(ans);
 
	}
//	static int min=Integer.MAX_VALUE;
	
	
  public static int  res(int [][] arr ,int []arr1 ,int i, int x,int cost){
	  if(i==arr.length){
		  for(int j=0;j<arr1.length;j++){
			  //System.out.print(arr1[j]+"a");
			  if(arr1[j]<x){
				  return  Integer.MAX_VALUE;
			  }
		  }
		//  System.out.println();
		//   min=Math.min(min, cost);
		   return cost ;
	  }
	  
	  int val =  res(arr,arr1,i+1,x,cost);
	  for(int j=0;j<arr1.length;j++){
		  arr1[j]+=arr[i][j+1];
	  }
	 
		  
		 val=Math.min(val, res(arr,arr1,i+1,x,cost+arr[i][0]));
		  
	
	  for(int j=0;j<arr1.length;j++){
		  arr1[j]-=arr[i][j+1];
	  }
	    
	    return val;
	  
	  
  }
 
}