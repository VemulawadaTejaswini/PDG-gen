import java.util.*;

public class Main { 
  public static void main(String[] args){

  Scanner scan = new Scanner(System.in);
  int a = scan.nextInt();
  int b = scan.nextInt();

  int squareArea = a * b;
  int perimeterLength = 2 * (a + b);
  
  System.out.print(squareArea + " " + perimeterLength);
  
  }
}