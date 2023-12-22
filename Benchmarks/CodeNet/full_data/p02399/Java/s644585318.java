import java.util.Scanner;

public class Main{
  
  public static void main(String[] args) {
    
    Scanner sin = new Scanner(System.in);

    int a = sin.nextInt();
    int b = sin.nextInt();
    double c = (double)a / (double)b;
    System.out.printf("%d %d %6.5f\n",a/b , a % b , c);
  }
}
