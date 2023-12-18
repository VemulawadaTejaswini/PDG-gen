import java.util.Scanner;

public class Main{
  
  public static void main (String [] args){
    
    Scanner scanner = new Scanner(System.in);     
    
    int num = scanner.nextInt(); 
    
    int N = num*num*num;
      
      System.out.println(N);
    
    scanner.close();
    
  }
  
}
   