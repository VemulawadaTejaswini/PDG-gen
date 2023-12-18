import java.io.*;
import java.util.*;
public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    int len = line.length();
    System.out.println(line.substring(0, 1) + (len - 2) + line.substring(len - 1));
  }
}