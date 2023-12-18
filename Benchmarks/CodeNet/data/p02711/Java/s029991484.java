import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
  	String num = input.nextLine();
    if (num.charAt(0) == '7' || num.charAt(1) == '7' || num.charAt(2) == '7') {
      System.out.println("Yes");
    }
    else {
      System.out.println("No");
    }
  }
}