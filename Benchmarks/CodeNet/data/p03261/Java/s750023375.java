
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String s = r.readLine();
    int n = Integer.parseInt(s);

    String w[] = new String[555];
    HashSet<String> set = new HashSet<>();
    
    for(int i = 0; i < n; i++)
    {
      String e = r.readLine();
      w[i] = e;
      set.add(e);
    }
    
    if(set.size() != n)
    {
      System.out.println("No");
      System.exit(0);
    }
    
    for(int i = 0; i < n - 1; i++)
    {
      if(w[i].charAt(w[i].length() - 1) != w[i + 1].charAt(0))
      {
        System.out.println("No");
        System.exit(0);
      }
    }
    
    System.out.println("Yes");
  }

}
