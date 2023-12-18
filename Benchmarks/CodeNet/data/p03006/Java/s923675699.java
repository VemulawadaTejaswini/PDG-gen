import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int N = scan.nextInt();
      	int[] x = new int[N];
      	int[] y = new int[N];
      	for(int i = 0; i < N; i ++){
        	x[i] = scan.nextInt();
          	y[i] = scan.nextInt();
        }
      if( N == 1) {
      	System.out.print(1);
      }
      int cost = N;
      for(int j = 0; j < N - 1; j++){
      int sabunx = x[j];
      int sabuny = y[j];
      	for(int i = j+1; i < N; i++){
           if(x[i]-x[j] == sabunx && y[i] - y[j] == sabuny){
           		cost = cost - 1;	
           }
        }
      }
    
    }

}