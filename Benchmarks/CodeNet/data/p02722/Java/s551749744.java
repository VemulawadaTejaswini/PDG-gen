import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    List<Long> list = new ArrayList<>();

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        long n = sc.nextLong();

        long cnt = 1;

        Set<Long> li = new HashSet<>();

        li.add(n);


        long root = (int)Math.sqrt(n);

        for (long i=1; i<=root; i++) {
            if ((n-1)%i==0) {
                li.add((long)i);
                li.add((n-1)/i);
            }

        }

//        for (long i=2; i<=root; i++) {
//            while (n%i==0) {
//                n /= i;
//            }
//            if (n%i==1) li.add((long)i);
//        }


        System.out.println(li);

        System.out.println(li.size());

    }

}
