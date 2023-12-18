import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String s = r.readLine();
    String[] sl = s.split("[\\s]+");
    int a = Integer.parseInt(sl[0]);
    int b = Integer.parseInt(sl[1]);
    s = r.readLine();

    String ans = "Yes";

    int i;

    for(i = 0; i < a; i++)
    {
      //System.out.println(s.charAt(i));
      if(!('0' <= s.charAt(i) && s.charAt(i) <= '9'))
      {
        ans = "No";
      }
    }

    //System.out.println(s.charAt(i));
    if(s.charAt(i) != '-')
    {
      ans = "No";
    }


    for(i++; i < a + b + 1; i++)
    {
      //System.out.println(s.charAt(i));
      if(!('0' <= s.charAt(i) && s.charAt(i) <= '9'))
      {
        ans = "No";
      }
    }

    System.out.println(ans);
  }

}
