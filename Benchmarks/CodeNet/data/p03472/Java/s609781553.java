import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String[] sl = r.readLine().split("[\\s]+");
    int N = Integer.parseInt(sl[0]);
    int H = Integer.parseInt(sl[1]);

    int[] a = new int[114514];
    int[] b = new int[114514];

    for(int i = 0; i < N; i++)
    {
      sl = r.readLine().split("[\\s]+");
      a[i] = Integer.parseInt(sl[0]);
      b[i] = Integer.parseInt(sl[1]);
    }


   int mainw = 0;
    for(int i = 0; i < N; i++)
    {
      if(mainw < a[i])
      {
        mainw = a[i];
      }
    }

    List<Integer> li = new ArrayList<Integer>();
    for(int i = 0; i < N; i++)
    {
      if(mainw < b[i])
      {
        li.add(b[i]);
      }
    }

    Collections.sort(li);

    int dam = 0;
    int count = 0;
    for(int i = li.size() - 1; 0 <= i; i--)
    {
      dam += li.get(i);
      count++;
      if(H <= dam)
      {
        break;
      }
    }

    if(dam < H)
    {
      count += (H - dam + mainw - 1) / mainw;
    }

    System.out.println(count);


  }

}
