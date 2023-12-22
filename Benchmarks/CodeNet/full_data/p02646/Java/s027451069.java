    import java.util.Scanner;
    public class Main
    {
      public static void main(String args[])
      {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int v = s.nextInt();
        int b = s.nextInt();
        int w = s.nextInt();
        int t = s.nextInt();
        if(v<=w && b-a>0) System.out.println("NO");
        else
        {
          if((v-w)*t>=(b-a)) System.out.println("YES");
          else System.out.println("NO");
        }
      }
    }