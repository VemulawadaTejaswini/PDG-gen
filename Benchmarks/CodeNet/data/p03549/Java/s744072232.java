	import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    int MOD = (int)998244353;

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println((100*n+1800*m)*(int)Math.pow(2, m));


    }
}

