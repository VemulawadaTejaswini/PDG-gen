import java.util.*;

public class Main
{
  public static void main(String[] args)
  {
	Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int max = 0, cnt = 0;
    while (n --> 0)
    {
      int h = in.nextInt();
      if (h >= max)
      {
		max = h;
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}
