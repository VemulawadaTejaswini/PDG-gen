import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int min = sc.nextInt();
        long ans = 0;

        for (int i = 1; i < n; i++) {
            int tmp = sc.nextInt();

            if (tmp > min) {
                min = tmp;
            } else {
                ans += (min - tmp);
            }
        }

        System.out.println(ans);


        sc.close();

        }

    }

