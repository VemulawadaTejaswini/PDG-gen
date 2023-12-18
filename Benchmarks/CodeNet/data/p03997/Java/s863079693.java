import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    try(BufferedReader reader
        = new BufferedReader(new InputStreamReader(System.in))
    ){
      int a = Integer.parseInt(reader.readLine());
      int b = Integer.parseInt(reader.readLine());
      int h = Integer.parseInt(reader.readLine());
      
      System.out.println((a + b) * h / 2);
    }
  }
}