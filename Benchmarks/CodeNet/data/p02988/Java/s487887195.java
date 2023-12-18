import java.util.Scanner;
 
public class Main{
  
  public static void main (String [] args){
    
    Scanner scanner = new Scanner(System.in);     
    
    int num1 = scanner.nextInt();
    
    int [ ] a = new int [num1];
    
    for(int i = 0; i < num1; i++) {
      
      System.out.println(i+1);
        
    }

    scanner.close();
    
  }
  
}