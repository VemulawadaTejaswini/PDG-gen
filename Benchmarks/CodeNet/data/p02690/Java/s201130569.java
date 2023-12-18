import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long a = 0;
        Map<Long, Long> set = new HashMap<>();
        while (true) {
            long tmp = (long) Math.pow(a , 5);
            set.put(tmp, a);
            if (set.containsKey(x + tmp)) {
                System.out.println(a+" "+set.get(x+tmp));
                break;
            }

            tmp = (long) Math.pow(-a , 5);
            set.put(tmp, -a);
            if (set.containsKey(x + tmp)) {
                System.out.println(-a+" "+set.get(x+tmp));
                break;
            }

            a++;
        }
    }
}