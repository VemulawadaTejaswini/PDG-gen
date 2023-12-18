import java.util.Scanner;
import java.util.InputMismatchException;

class main{
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    int r = scanner.nextInt();
    scanner.close();
    System.out.println(r*r);
  }
}