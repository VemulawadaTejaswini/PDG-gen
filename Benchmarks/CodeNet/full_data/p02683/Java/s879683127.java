import java.util.Arrays;
import java.util.Scanner;

public class Main{
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		 
		  int n=scn.nextInt();
		  int m =scn.nextInt();
		  int x =scn.nextInt();
		  int [][] arr =new int[n][m];
		  int [] cost =new int [n];
		  for(int i=0;i<n;i++){
			  cost[i]=scn.nextInt();
			  
			  for(int  j=0;j<m;j++){
				  arr[i][j]=scn.nextInt();
			  }
		  }
		//  min=Integer.MAX_VALUE;
		  int []arr1 =new int[m];
		 int ans =res(arr,arr1,0,x,0,cost);
		  if(ans==Integer.MAX_VALUE){
			  System.out.println(-1);
			  return;
		  }
		  System.out.println(ans);
 
	}
//	static int min=Integer.MAX_VALUE;
	
	
  public static int  res(int [][] arr ,int []arr1 ,int i, int x,int cost, int [] cost1){
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
	  int val=Integer.MAX_VALUE;
	  for(int j=0;j<arr1.length;j++){
		  arr1[j]+=arr[i][j];
	  }
	  for(int j=0;j<arr[0].length;j++){
		  
		 val=Math.min(val, res(arr,arr1,i+1,x,cost+cost1[i],cost1));
		  
	  }
	  for(int j=0;j<arr1.length;j++){
		  arr1[j]-=arr[i][j];
	  }
	    val = Math.min(val, res(arr,arr1,i+1,x,cost,cost1));
	    return val;
	  
	  
  }
 
}