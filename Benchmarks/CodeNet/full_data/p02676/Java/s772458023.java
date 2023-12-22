import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sysin = new Scanner(System.in);
    int k = Integer.parseInt(sysin.nextLine());
    String s = sysin.nextLine();
    if(s.length() > k){
      System.out.print(s.substring(0, k) + "...");
    } else {
      System.out.print(s);
    }
  }
}