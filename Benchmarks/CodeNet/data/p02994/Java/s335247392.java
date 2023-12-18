import java.util.Scanner;
import java.lang.Math;
 
public class Main{
	public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
      int N=sc.nextInt();
      int L=sc.nextInt();
      int min1=0;
      int total=0;
      int[] arr = new int[N];
      for (int i=0;i<N;i++){
      	arr[i]=L+i-1;
      }
      int min = Math.abs(arr[0]);
      for (int n = 0; n < N; n++) {
    	int v = Math.abs(arr[n]);
   		if (v < min) {
      		  min = v;
  		 }
      }
      for (int k=0; k<N;k++){
      if (min==Math.abs(arr[k])){
      min1=k;
        break;
      }
      }
      for (int l=0; l<N; l++){
        total+=arr[l];
      }
      System.out.println(total-arr[min1]);
    
    }
}