import java.util.Scanner;

class Main{
  public static void main(String args[]){
  
    Scanner stdIn = new Scanner(System.in);
   
    short a = stdIn.nextShort();
    short b = stdIn.nextShort();
    short c = stdIn.nextShort();
    
    if(Math.sqrt(a) + Math.sqrt(b) < Math.sqrt(c))
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}