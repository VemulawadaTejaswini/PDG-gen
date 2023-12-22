import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[][] arr=new int[n][2];
      for(int i=0;i<n;i++){
          arr[i][0]=sc.nextInt();
          arr[i][1]=sc.nextInt();
      }
      int dist=0;
      for(int i=1;i<n;i++){
          int temp=Math.abs(arr[i][0]-arr[i-1][0])+Math.abs(arr[i][1]-arr[i-1][1]);
          dist=Math.max(dist,temp);
      }
      System.out.println(dist);
	}
}