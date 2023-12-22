import java.util.Scanner;

public class Main{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      long n = sc.nextInt();
      
      if(n == 1){
      	System.out.println(1);
      }
      else{
      	long nfact = 1;
        
        for(long i = n; i > 0; i--){
        	nfact *= i;
        }
        
        long power = 1;
        
        for(long i = 0; i < n - 2; i++){
        	power *= 10;
        }
        
        long total = nfact*power % (1000000007);
        
        System.out.println(total);
      }
      
    }
}