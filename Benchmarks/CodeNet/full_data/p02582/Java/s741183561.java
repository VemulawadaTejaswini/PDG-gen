import java.util.*;

public class Main
{
  public static void main(String[] args)
  {
  	Scanner sc = new Scanner(System.in);
    String s = sc.next();

    int max = 0;
    int tmp = 0;

    for (int i=0; i<s.length(); i++)
    {
        if (s.charAt(i) == 'R')
            tmp++;
        else
            tmp = 0;
        
        if (tmp > max)
            max = tmp;
    }

    System.out.println(max);

  }
}