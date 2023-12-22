import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int a = stdIn.nextInt();
    System.out.print(a + a*a + a*a*a);
  }
}