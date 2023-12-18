import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;

        for (int i = 0; i < N; ++i)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int bigger = Math.max(x, y);
            int smaller = Math.min(x, y);

            max = Math.max(max, bigger);
            second_max = Math.max(second_max, smaller);
            min = Math.min(min, smaller);
            second_min = Math.min(second_min, bigger);
        }

        long ans;
        if (second_max >= second_min)
        {
            ans = Math.min(
                    (long)(max - min) * (long)(second_max - second_min),
                    (long)(max - second_min) * (long)(second_max - min)
            );
        }
        else
        {
            ans = (long)(max - second_min) * (long)(second_max - min);
        }

        System.out.println(ans);
    }
}
