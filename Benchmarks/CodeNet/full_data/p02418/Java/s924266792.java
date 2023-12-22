import java.util.*;
import java.io.*;

class Main {
  public static void main(String args[]) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = "";
    String p = "";
    try {
      s = br.readLine();
      p = br.readLine();
    } catch (IOException e) {
      e.printStackTrace();
    }
    s = s + s;
    System.out.println(s.indexOf(p) != -1? "Yes" : "No");
  }
}