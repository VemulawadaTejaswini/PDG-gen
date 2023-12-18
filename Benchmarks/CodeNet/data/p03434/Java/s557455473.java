import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    private static InputStream debugInput() {
        String s = "4\n" +
                "20 18 2 18";
        return new ByteArrayInputStream(s.getBytes());
    }

    private static InputStream stdin() {
        return System.in;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(stdin());
        int n = sc.nextInt();
        int[] xs = new int[n];
        for (int i = 0; i < n; i++) {
            xs[i] = sc.nextInt();
        }
        Arrays.sort(xs);

        boolean isA = true;
        int sumOfA = 0;
        int sumOfB = 0;
        for (int i = 0; i < n; i++) {
            int value = xs[n - i - 1];
            if (isA) {
                sumOfA += value;
            }
            else {
                sumOfB += value;
            }
            isA = !isA;
        }

        System.out.println(sumOfA - sumOfB);
   }
}
