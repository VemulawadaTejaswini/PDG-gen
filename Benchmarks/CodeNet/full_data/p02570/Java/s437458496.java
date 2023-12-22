import java.util.Scanner;

public class Main {
public static void main(String[] args)
{
    Scanner in = new Scanner(System.in);
    int D = in.nextInt();
    int T = in.nextInt();
    int S = in.nextInt();
    int ans = time(T);
    System.out.println(ans);
}

public static int time(int T)
  {
    if (T >= 1 && T <= 10000)
    {
      System.out.println("yes");
    }
return T;
  }
}
