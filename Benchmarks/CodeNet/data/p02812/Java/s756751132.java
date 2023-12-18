import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    sc.next();
    String s = sc.next();
    int ans = s.split("ABC").length - 1;
    System.out.println(ans);
  }
}
