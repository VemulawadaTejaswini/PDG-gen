import java.util.Scanner;

public class Main{
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
      
      	int a = sc.nextInt();
      	int b = sc.nextInt();
      	int c = sc.nextInt();
      	int d = sc.nextInt();
      
      	int r_sum = 0;
      	int r = 0;
      
      	int a_a = 1;
        int b_b = 1;
      
      	r = a * (d-b);
      	for(int i = a+1; i <= c; i++){
              r = i - a;
              for(int k = 1; k <= d; k++){
                int j = k;
                for(; j <= d; j++){
                     r *= i; 
                }
                for(j = d - k; j <= d; j++){
                     r *= i - 1; 
                }
              }
          
          	r_sum += r;
	        r = 0;
        }
      System.out.print(r_sum);
      	
    }
}
