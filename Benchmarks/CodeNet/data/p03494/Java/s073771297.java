import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int n = stdin.nextInt();
        int[] a = new int[n];
        int count = 0;
        boolean exsitOdd = false;

        for (int i = 0; i < n; i++)
            a[i] = stdin.nextInt();

        while (true) {
            for (int e : a) {
                if (e % 2 == 1)
                    exsitOdd = true;

                e /= 2;
            }

            if (exsitOdd)
                break;

            count++;
        }
        System.out.println(count);
    }
}