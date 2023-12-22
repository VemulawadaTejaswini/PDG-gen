import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = 1;
    while (true) {
      if (Integer.parseInt(sc.nextInt()) == 0) break;
      System.println("Case " + i + " " + Integer.parseInt(sc.nextInt()));
      i++;
    }
  }
}