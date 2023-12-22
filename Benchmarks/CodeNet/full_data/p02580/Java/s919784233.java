import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner scn=new Scanner(System.in);
	     int h =scn.nextInt();
	     int w =scn.nextInt();
	     long [] arr =new long[h];
	     long []arr2 =new long[w];
	     int t =scn.nextInt();
	     int [][]arr3 =new int[h][w];
	     while(t-->0){
	    	 int r =scn.nextInt();
	    	 int c =scn.nextInt();
	    	 arr3[r-1][c-1]=1;
	    	 arr[r-1]++;
	    	 arr2[c-1]++;
	    	 
	     }
	     long max=0;
	     for(int i=0;i<h;i++){
	    	 for(int j=0;j<w;j++){
	    		 max=Math.max(arr[i]+arr2[j]-arr3[i][j],max);
	    	 }
	     }
	   System.out.println(max);

	}
	public static class pair implements Comparable<pair>{
		long val;
		int r ;
		int c;
		public pair(int r , int c , long val){
			this.r=r;
			this.c=c;
			this.val=val;
		}
		public int compareTo(pair o){
			return (int)(o.val-this.val);
		}
	}

}