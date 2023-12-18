import java.util.Scanner;

public class Main{
  public static void main(String argv[]){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    System.out.println(n > 999 ? "ABD" : "ABC");

  }
}
