import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    int a = Integer.parseInt(r.readLine());

    System.out.println(a <= 999 ? "ABC" : "ABD");
  }

}
