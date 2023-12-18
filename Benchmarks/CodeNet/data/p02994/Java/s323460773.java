import java.util.Scanner;

public class Main{
	public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
      int N=sc.nextInt();
      int L=sc.nextInt();
      int[] arr = new int[N];
      for (int i=0;i<N;i++){
      	arr[i]=L+i-1;
      }
      for (int n = 0; n < N; n++) {
    	int v = arr[n];
   		if (v < min) {
      		  min = v;
  		 }
      }
      for (int l=0; l<N; l++){
      	int total=0;
        total+=arr[l];
      }
      System.out.println(total-min);
    
    }
}