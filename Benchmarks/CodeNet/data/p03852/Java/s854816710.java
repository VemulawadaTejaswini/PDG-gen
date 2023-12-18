import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String c = in.next();

    switch (c) {
      case "a":
      case "i":
      case "e":
      case "o":
      case "u":
          System.out.println("vowel");
          break;
      default:
          System.out.println("consonant");
    }
  }
}
o