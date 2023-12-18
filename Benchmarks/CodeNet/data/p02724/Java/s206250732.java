import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long ans = 0;

        for (int i = 0; i < 10000000; i++) {

            if(n >= 500) {
                n -= 500;
                ans += 1000;
                continue;
            }

            if(n >= 5) {
                n -= 5;
                ans += 5;
                continue;
            } else {
                break;
            }


        }

        System.out.println(ans);

        sc.close();
    }

}