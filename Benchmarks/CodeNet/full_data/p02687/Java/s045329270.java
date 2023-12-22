import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = in.readLine();
    
    if(s.equals("ABC"))
      System.out.println("ARC");
    else
      System.out.println("ABC");
  }
}