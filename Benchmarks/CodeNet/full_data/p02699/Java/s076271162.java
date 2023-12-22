import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int s = stdIn.nextInt();
    int w = stdIn.nextInt();
    
    if (s > w){
      System.out.print("safe");
    }
    else{
      System.out.print("unsafe");
    }
  }
}