import java.util.Scanner;

public class Main {
public static void main(String[] args)
{
    Scanner in = new Scanner(System.in);
    int D = in.nextInt();
    int T = in.nextInt();
    int S = in.nextInt();
    int answer = time(T, D, S);
    System.out.println(answer);
}

public static int time(int T, int D, int S)
  {
   int ans = 0;
   if (T == 0) {
       return T;
   }
   else {
       ans = D / S;
   }
   return ans;
  }
}
