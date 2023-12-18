import java.util.*;

public class Main
{
	public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int[] fo = new int[10001];
      int[] fe = new int[10001];
      int maxo = 0;
      int maxe = 0;
      for (int i = 0; i < n; i++)
      {
        if (i %2 == 0)
          maxo = Math.max(maxo, ++fo[in.nextInt()]);
        else
          maxe = Math.max(maxe, ++fe[in.nextInt()]);
      }
      System.out.println(((n/2-maxo)+(n/2-maxe)));
      in.close();
    }
}