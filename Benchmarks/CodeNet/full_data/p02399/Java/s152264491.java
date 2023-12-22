import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  Formatter frm = new formatter();

  int a = scan.nextInt();
  int b = scan.nextInt();

  int d = a / b;
  int r = a % b;
  frm.formatter = ("%.5f",(double)a / b);

  System.out.printf(d + " " + r + " " + frm);
  }
}