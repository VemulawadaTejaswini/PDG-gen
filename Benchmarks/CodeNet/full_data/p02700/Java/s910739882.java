import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A, B, C, D;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        if(B >= C) System.out.println("Yes");
        else
        {
          int check = (A/D+A%D) >= (C/B+C%B) ? 1 : 0;
          switch (check)
          {
              case 1:
                  System.out.println("Yes");
                  break;
              case 0:
                  System.out.println("No");
                  break;
          }

        }

    }
}
