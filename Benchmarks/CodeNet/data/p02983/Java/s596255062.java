import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int r = sc.nextInt();

        long min = Long.MAX_VALUE;
        if (r - l >= 2019) {
            min = 0;
        } else {
            flag:
            for (int i = l+1; i <= r; i++) {
                for (int j = l; j < r; j++) {
                    min = Math.min(min, (i * j) % 2019);
                    if (min == 0) break flag;
                }
            }
        }


        System.out.println(min);
    }
}