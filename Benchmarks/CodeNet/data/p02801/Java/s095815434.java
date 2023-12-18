import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String N = scan.nextLine();
    String str = "abcdefghijklnmopqrstuvwxyz";
    int x =  str.indexOf(N);
    System.out.println(str.charAt(x + 1));

  }
}
