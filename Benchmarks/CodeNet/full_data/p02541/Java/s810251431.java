import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      
     	long N = scan.nextInt();
      
      	double k = 1.1;
      
      	long mult = 1;
      
        while(Math.floor(k) != k){
          
          k = (Math.sqrt(1 + (8*N*mult)) - 1)/2;
          
          if(k%1 < 0.2){
          	mult += 3;
          }
          else{
          	mult +=1;
          }
          System.out.println(k%1);
        }
      
      	System.out.println((int) k); 
    }
}