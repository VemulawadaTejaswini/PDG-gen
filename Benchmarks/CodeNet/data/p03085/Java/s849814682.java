import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    String in = s.next();
    for (char c : in.toCharArray()) {
      switch (c) {
        case 'A':
          System.out.print("T");
          break;
        case 'T':
          System.out.print("A");
          break;
        case 'C':
          System.out.print("G");
          break;
        case 'G':
          System.out.print("C");
          break;
      }
    }
    System.out.println();
  }
}
