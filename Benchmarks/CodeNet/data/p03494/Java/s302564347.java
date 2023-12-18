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

        while (!exsitOdd) {
            for (int e : a) {
                if (e % 2 == 1) {
                    exsitOdd = true;
                    break;
                }
                e /= 2;
            }
            count++;
        }
        System.out.println(count - 1);
    }
}