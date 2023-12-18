import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();

        float res;

        if (N % 2 == 0)  res = (float) (1.0 / 2.0);
        else {
            int odd = N /2 +1;
            res = (float)odd / N;
        }

        System.out.println(res);
        s.close();
    }
}