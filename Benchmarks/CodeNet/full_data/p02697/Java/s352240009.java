import java.util.*;
public class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int m = sc.nextInt();

        int count = 0;
        for (int i = 1; i <= n /2 && count < m; i++) {
            if ((n + 1 - 2 * i) != n / 2) {
                System.out.println(i + " " + (n + 1 - i));
                count++;
            }
        }

    }


}