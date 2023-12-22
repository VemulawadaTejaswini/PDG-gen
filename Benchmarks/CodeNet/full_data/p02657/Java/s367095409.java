import java.util.Scanner;
public class MultiplicationOne{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int one = scan.nextInt();
    int two = scan.nextInt();
    
    int total = one * two;
    
    System.out.println(total);
  }
}