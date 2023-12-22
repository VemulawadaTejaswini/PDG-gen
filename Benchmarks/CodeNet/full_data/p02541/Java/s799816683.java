import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      
     	long N = scan.nextInt();
      
      	double k = 1.1;
      
      	long mult = 1;
      
        while(Math.floor(k) != k){
          
          k = (-1 + Math.sqrt(1 + (8*N*mult)))/2;
          
          mult += 1;
        }
      
      	System.out.println((int) k); 
    }
}