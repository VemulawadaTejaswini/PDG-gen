import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int x = sc.nextInt();
    boolean ans = k * 500 >= x;
    System.out.println(ans ? "Yes": "No");
  }
}
