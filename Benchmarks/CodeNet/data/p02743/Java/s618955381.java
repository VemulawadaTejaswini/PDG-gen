import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    double result = Math.sqrt(a)+ Math.sqrt(b) - Math.sqrt(c);
    if(result < 0){
      System.out.println("Yes");
    }
    if(result >= 0){
      System.out.println("No");
    }
  }
}