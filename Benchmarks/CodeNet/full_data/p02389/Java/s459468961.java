import java.util.*;

public class Main { 
  public static void main(String[] args){

  Scanner scan = new Scanner(System.in);
  String s0 = scan.next();
  String[] s1 = s0.split(" ");
  
  int a = Integer.parseInt(s1[0]);
  int b = Integer.parseInt(s1[1]);
  
  int squareArea = a * b;
  int perimeterLength = 2 * (a + b);
  
  System.out.print(squareArea + " " + perimeterLength);
  
  }
}