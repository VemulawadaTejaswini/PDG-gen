import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int[] stuff = new int[b - a + 1];
        if (!(a == b)) {
            for (int i = a; i < b + 1; i++) {
                stuff[i - a] = i % 2019;
                if (i % 2019 == 0) {
                    System.out.print(0);
                    System.exit(0);
                }
            }
            Arrays.sort(stuff);
            int m = stuff[0] * stuff[1];
            System.out.print(m % 2019);
        } else {
            System.out.print((b % 2019) * (b % 2019));
        }
    }
}