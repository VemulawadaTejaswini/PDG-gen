import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);

  int a = scan.nextInt();
  int b = scan.nextInt();

  int d = a / b;
  int r = a % b;
  double f = a / b;

  System.out.println(d + " " +  r + " " + "%.5f"f);
  }
}