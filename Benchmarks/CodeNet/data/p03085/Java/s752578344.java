import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String b = br.readLine()
            .replaceAll("A", "t")
            .replaceAll("T", "a")
            .replaceAll("C", "g")
            .replaceAll("G", "c")
            .toUpperCase();
    
    System.out.println(b);
  }
}
