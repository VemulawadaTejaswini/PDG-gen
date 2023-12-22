
import java.util.Scanner;

class Main
{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();

        if (A < 0) {
            System.out.println((A * -1) * C + B * E + D);
        } else {
            System.out.println((B - A) * E);
        }
        if (A == 0) {
            System.out.println(B * E + D);
        }

    }

}

