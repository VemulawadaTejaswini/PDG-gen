import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int r_max, r_min, b_max, b_min;
        r_max = r_min = sc.nextInt();
        b_max = b_min = sc.nextInt();

        for (int i = 1; i < N; ++i)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int r_max_1, r_min_1, b_max_1, b_min_1;
            int r_max_2, r_min_2, b_max_2, b_min_2;

            int r = x;
            int b = y;

            r_max_1 = Math.max(r_max, r);
            r_min_1 = Math.min(r_min, r);
            b_max_1 = Math.max(b_max, b);
            b_min_1 = Math.min(b_min, b);

            r = y;
            b = x;
            r_max_2 = Math.max(r_max, r);
            r_min_2 = Math.min(r_min, r);
            b_max_2 = Math.max(b_max, b);
            b_min_2 = Math.min(b_min, b);

            if ((long)(r_max_1 - r_min_1) * (long)(b_max_1 - b_min_1) <
                (long)(r_max_2 - r_min_2) * (long)(b_max_2 - b_min_2))
            {
                r_max = r_max_1;
                r_min = r_min_1;
                b_max = b_max_1;
                b_min = b_min_1;
            }
            else
            {
                r_max = r_max_2;
                r_min = r_min_2;
                b_max = b_max_2;
                b_min = b_min_2;
            }
        }

        System.out.println((long)(r_max - r_min) * (long)(b_max - b_min));
    }
}
