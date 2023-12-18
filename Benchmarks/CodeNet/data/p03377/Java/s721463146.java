import java.util.Scanner;
public class Main
{
      public static void main (String[] args)
      {
            Scanner sc = new Scanner(System.in);
            int A,B,X;
            A = sc.nextInt();
            B = sc.nextInt();
            X = sc.nextInt();
            if(B<X)
            {
                  System.out.println("NO");
                  
            }
            else
            {
                  System.out.println("Yes");
            }
      }
}
