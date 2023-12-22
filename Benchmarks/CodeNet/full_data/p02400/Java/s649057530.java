import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    double menseki = 3.141592 * r * r;
    double ensyu = 2 * 3.141592 * r;
    
    System.out.printf("%.5f %.5f",menseki,ensyu);
  }
}