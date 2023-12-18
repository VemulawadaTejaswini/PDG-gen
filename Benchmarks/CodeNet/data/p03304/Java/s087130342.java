import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws Exception{
    try (Scanner sc = new Scanner(System.in)){
      String s = sc.next();
      int w = sc.nextInt();
      String[] tokens = s.split("");
      String out = "";
      for (int i = 0; i < s.length(); i += w) {
        out = out + tokens[i];
      }
      System.out.println(out);
    }
  }
}