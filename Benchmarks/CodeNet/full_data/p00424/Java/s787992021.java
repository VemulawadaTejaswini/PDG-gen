import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) {

    new Main().run();
  }

  public void run() {

    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int n;
      String line,s;
      Map<String,String> map = new HashMap<>();
      StringBuilder buf = new StringBuilder(60000);
      while (true) {
        n = Integer.parseInt(br.readLine());
        if(n == 0) break;

        for(int i=0; i<n; i++) {
          line = br.readLine();
          map.put(line.substring(0,1), line.substring(2,3));
        }

        n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
          s = br.readLine();
          if(map.containsKey(s))
            buf.append(map.get(s));
          else
            buf.append(s);
        }
        buf.append("\n");
        map.clear();
      }

      System.out.print(buf);
    }
    catch (IOException e) {
      System.err.println(e);
    }
  }
}
