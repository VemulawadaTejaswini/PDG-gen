import java.io.*;

public class Main {
  public static void main(String[] args) {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = "";
    try {
      s = new String(in.readLine());
    } catch(Exception e) {
      System.out.println("嘘やろ");
    }
    int cnt = 0;
    while(true) {
      String s2 = s.replaceFirst("ABC", "BCA");
      if (s == s2) {
        break;
      } else {
        ++cnt;
      }
      s = s2;
    }
    System.out.println(cnt);
  }
}