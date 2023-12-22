import java.io.*;
import java.util.Scanner;

class Main {
  public static void main (String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(reader.readLine());
    String str;

    for(int i=0; i<n; i++){
      str = reader.readLine();
      str = str.replaceAll("Hoshino", "Hoshina");
      System.out.println(str);
    }
  }
}