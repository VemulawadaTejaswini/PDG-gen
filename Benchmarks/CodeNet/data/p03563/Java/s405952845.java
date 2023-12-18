import java.util.Scanner;

public class Main{
  public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int first = scan.nextInt();
      int heikin = scan.nextInt();
      int plus = heikin-first;
      System.out.println((heikin+plus));
  }
}