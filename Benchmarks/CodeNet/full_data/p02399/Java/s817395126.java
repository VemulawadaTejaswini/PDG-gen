import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    int d = a / b;
    int r = a % b;
    double f = 1.0 * a / b;
    
    System.out.println(""+d+" "+r+" "%05f",f");
  }
}