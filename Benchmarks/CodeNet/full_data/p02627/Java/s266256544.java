import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
  	String in = userName = myObj.nextLine();
    if (in.charAt(0) >= 'a' && in.charat(0) <= 'z') {
      System.out.println("a");
    } else {
      System.out.println("A");
    }
  }
}