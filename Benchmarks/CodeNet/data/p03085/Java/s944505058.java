import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String p = in.nextLine();
    in.close();
    String ans = p.equals("A") ? "T"
        : p.equals("T") ? "A"
        : p.equals("C") ? "G"
        : "G";
    System.out.println(ans);
  }
}