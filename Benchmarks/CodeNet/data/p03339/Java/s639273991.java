import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String line = sc.next();
    int min = line.length();
    for (int i = 0; i < line.length(); i++) {
      String lineWest = line.substring(0, i);
      String lineEast = line.substring(i + 1);
       int count = (lineWest.length() - lineWest.replace("W", "").length() +
                          lineEast.length() - lineEast.replace("E", "").length());
       min = Math.min(min, count);
    }
    System.out.println(min);
  }
}