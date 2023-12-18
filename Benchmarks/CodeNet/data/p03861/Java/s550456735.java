import java.util.Scanner;

public class Main{
  
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String[] tokens = scanner.nextLine().split(" +");
    
    long a = new Long(tokens[0]);
    long b = new Long(tokens[1]);
    long x = new Long(tokens[2]);
   
    if(a!=b){
      	if(a!=0){
    		long n_lower = (a-1)/(x);
    		long n_upper = b/(x);
    		System.out.println(n_upper-n_lower);
        }
      	else{
         	System.out.println(b/(x));
        }
    }
    else{
      if(a%x == 0){
        System.out.println("1");
      }
      else{
        System.out.println("0");
      }
    }
  }
}