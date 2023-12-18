import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {

    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      String line = in.readLine();
      int k = Integer.parseInt(in.readLine());

      int n = line.length();
      Set<String> set = new TreeSet<>();

      for(int i=0; i <= n; i++) {
        String s = "";
        for(int j=i; j<=n; j++) {
          // if( (1&i>>j) == 1 )
            s = line.substring(i, j);
            set.add(s);
        }
      }

      // for(String s: set)
      //   System.out.println(s);

      Iterator<String> ite = set.iterator();
      String[] str = new String[k+1];
      for(int i=0; i<=k; i++)
        str[i] = ite.next();

      System.out.println(str[k]);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}