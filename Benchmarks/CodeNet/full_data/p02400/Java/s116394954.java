import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    
    double square = Math.PI * r * r ;
    double perimeter = Math.PI * 2 * r;
    
    System.out.println(square + " "+ perimeter);
  }
}