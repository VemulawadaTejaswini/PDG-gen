import java.util.Scanner; 

public class MyClass {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    String S;
    String T;
    
    System.out.println("Enter S"); 
    S = myObj.nextLine();  
    
    System.out.println("Enter T"); 
    T = myObj.nextLine();   
       
    System.out.println(T+S);        
  }
}
