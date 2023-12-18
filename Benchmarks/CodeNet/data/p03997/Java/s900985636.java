import java.util.Scanner;

public class Main {
  static public void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    int a;
    int b;
    int h;
    int s;
    
    a = scan.nextLine();
    b = scan.nextLine();
    h = scan.nextLine();
    
    s = (a+b) / h;
    
    System.out.println(s);
    
  }