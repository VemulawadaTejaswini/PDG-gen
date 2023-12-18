import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import java.util.stream.Stream;;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      String[] lines = br.readLine().split(" ");
      // int  n = Integer.parseInt(lines[0]);
      int z = Integer.parseInt(lines[1]);

      final Pattern delim = Pattern.compile(" ");
      int d = delim
        .splitAsStream(br.readLine())
        .mapToInt(Integer::parseInt)
        .map(l -> l-z)
        .map(Math::abs)
        .reduce(Main::gcd)
        .getAsInt();
      
      System.out.println(d);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
  
  public static int gcd(int x, int y) {
    if( x<y ) {
      int tmp = x; x = y; y = tmp;
    }
    if( (x%y) == 0 ) return y;
    else return gcd(y,x%y);
  }
}