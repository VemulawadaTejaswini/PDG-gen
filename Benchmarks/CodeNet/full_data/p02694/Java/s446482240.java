import java.util.*;

public class Main{

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        new Main().run();
    }

    void run() {

        long x = sc.nextLong();

        long ans = 0;

        long base = 100;

        while (base < x) {
            base *= 1.01;
            ans++;
        }

        System.out.println(ans);
    }
}
