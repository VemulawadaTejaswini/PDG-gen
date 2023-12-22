import java.util.*;

public class Main{

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        new Main().run();
    }

    void run() {

        long a = sc.nextLong();
        long b = sc.nextLong();
        long n = sc.nextLong();

        long ans = 0;

        if (n < b) {
            ans = (a*n)/b - a*(n/b);
            System.out.println(ans);
            return;
        }

        ans = a*(b-1)/b - a*((b-1)/b);

        System.out.println(ans);


    }
}
