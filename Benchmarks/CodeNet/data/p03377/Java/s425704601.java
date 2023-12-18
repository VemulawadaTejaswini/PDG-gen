import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int X = scanner.nextInt();

    if(X >= A && B >= X - A){
      System.out.println("Yes");
    } else {System.out.println("No");}
  }
}
