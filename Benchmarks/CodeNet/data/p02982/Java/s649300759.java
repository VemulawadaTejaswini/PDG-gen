import java.util.*;
import 	java.math.*;

public class Main{
	public static void main(String[] args){
    	Scanner s=new Scanner(System.in);	
      int n=s.nextInt();
      int d=s.nextInt();
      int[][] arr=new int[n][d];
      for(int i=0;i<n;i++){
      	for(int j =0;j<d;j++){
        	arr[i][j]=s.nextInt();
        }
      }
      int count=0;
      for(int i=0;i<n;i++){
      	for(int j=i+1;j<n;j++){
        	double squares=0.0;
          	for(int k=0;k<d;k++){
            	squares+=(arr[i][k]-arr[j][k])*(arr[i][k]-arr[j][k]);
            }
          double value=Math.sqrt(squares);
          if(value-(int)value==0.0)count++;
        }
      }
      System.out.println(count);
    }
}