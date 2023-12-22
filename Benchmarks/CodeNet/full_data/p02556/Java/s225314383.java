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
      for(int i=0;i<n;i++){
          for(int j=i+1;j<n;j++){
            int temp=Math.abs(arr[i][0]-arr[j][0])+Math.abs(arr[i][1]-arr[j][1]);
            dist=Math.max(dist,temp);
          }
      }
      System.out.println(dist);
	}
}