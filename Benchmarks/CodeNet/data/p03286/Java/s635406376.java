import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {
    
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(in.readLine());

      StringBuilder buf = new StringBuilder();
      while(n != 0) {
        if((n & 1) != 0) {
          n--;
          buf.append(1);
        }
        else {
          buf.append(0);
        }

       n /= -2;
      }

      if(buf.length() == 0)
        buf.append('0');
      else
        buf.reverse();
      
      System.out.println(buf);
    }
    catch(IOException e){
      System.err.println(e);
    }
  }
}