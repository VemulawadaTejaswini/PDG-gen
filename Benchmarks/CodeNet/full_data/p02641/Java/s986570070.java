import java.util.*;
import java.text.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        int x = sc.nextInt();
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i=-200; i<=200; i++) {
            list.add(i);
        }

        for (int i=0; i<n; i++) {
            int t = sc.nextInt();
            list.remove((Integer)t);
        }

        int res = 1000;
        int diff = 10000;

        for (Integer i: list) {
            if (Math.abs(x-i)<diff) {
                diff = Math.abs(x-i);
                res = i;
            }
        }

//        System.out.println(list);

        System.out.println(res);
    }


}
