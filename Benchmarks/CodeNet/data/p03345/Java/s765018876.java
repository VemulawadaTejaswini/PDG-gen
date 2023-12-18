import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    
    String sl[] = r.readLine().split(" ");
    long a = Long.parseLong(sl[0]);
    long b = Long.parseLong(sl[1]);
    long c = Long.parseLong(sl[2]);
    long k = Long.parseLong(sl[3]);

    System.out.println(k % 2 == 0 ? a - b : b - a);

  }
}
