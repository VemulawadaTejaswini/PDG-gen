import java.util.Scanner;
import java.lang.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    System.out.println(1000 - (n%1000));
  }
}
