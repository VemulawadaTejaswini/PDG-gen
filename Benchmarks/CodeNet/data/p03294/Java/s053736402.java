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
      String line = in.readLine();
      int sum = 0;
      
      int offset=0,next=0;
      char regex = ' ';
      for(int i=0; i<n; i++) {
        if((next = line.indexOf(regex,offset)) == -1)
          next = line.length();
        sum += Integer.parseInt(line.substring(offset, next));
        offset = ++next;
      }

      System.out.println(sum-n);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}