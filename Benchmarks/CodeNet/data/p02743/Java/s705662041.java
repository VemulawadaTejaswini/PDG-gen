import java.util.Scanner;

class Main{
  public static void main(String args[]){
  
    Scanner stdIn = new Scanner(System.in);
   
    double a = Math.sqrt(stdIn.nextLong());
    double b = Math.sqrt(stdIn.nextLong());
    double c = Math.sqrt(stdIn.nextLong());
    
    if(a + b < c)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}