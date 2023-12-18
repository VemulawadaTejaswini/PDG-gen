import java.util.*;

public class Main{
	public static void main(String args[]){
    	
      Scanner scan = new Scanner(System.in);
      int N = scan.nextInt();
      int K = scan.nextInt();
      double M = K/2;
      int sum = 0;
      for(int i=0;i<N;i++){
      	int a = scan.nextInt(); 
   		if(a > M){
        	sum = sum + 2 * (K - a);
        }else{
          	sum = sum + 2 * a;
        }   	
      }
      System.out.println(sum);
    }
}