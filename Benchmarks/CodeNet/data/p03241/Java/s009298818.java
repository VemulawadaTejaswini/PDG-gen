import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int m = sc.nextInt();

        int min = 1;
        int max = m / n;

        List<Integer> factor = new ArrayList<>();

        for (int i=1; i<=Math.sqrt(m)+1; i++) {
            if (m % i ==0) {
                factor.add(i);
                factor.add(m / i);
            }
        }

        Collections.sort(factor);
//        System.out.print(factor);
//        System.out.print(min);
//        System.out.print(max);

        for (int l: factor) {
            if (l <= max) min = Math.max(min, l);
        }

        System.out.print(min);

    }


}

