import java.util.Scanner;

class Main{
  public static void main(String args[]){
  
    Scanner stdIn = new Scanner(System.in);
   
    int a = (int)Math.sqrt(stdIn.nextInt());
    int b = (int)Math.sqrt(stdIn.nextInt());
    int c = (int)Math.sqrt(stdIn.nextInt());
    
    if(a + b < c)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}