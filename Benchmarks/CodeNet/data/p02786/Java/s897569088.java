import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    long h = Long.parseLong(in.readLine());
    
    long multiple = 1;
    for(long i=h; i>0; i/=2) {
      multiple *= 2;
    }
    
    System.out.println(multiple-1);
  }
}