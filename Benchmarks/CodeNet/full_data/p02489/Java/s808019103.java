import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = 1;
    while (true) {
      if (Integer.parseInt(sc.next()) == 0) break;
      System.out.println("Case " + i + " " + Integer.parseInt(sc.next()));
      i++;
    }
  }
}