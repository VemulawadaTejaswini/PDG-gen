import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long b = 0;
        Map<Long, Long> set = new HashMap<>();
        while (true) {
            long tmp = (long) Math.pow(b , 5);
            set.put(tmp, b);
            if (set.containsKey(x + tmp)) {
                System.out.println(set.get(x+tmp) + " " + b);
                break;
            }

            tmp = (long) Math.pow(-b , 5);
            set.put(tmp, -b);
            if (set.containsKey(x + tmp)) {
                System.out.println(set.get(x+tmp)+" "+(-b));
                break;
            }

            b++;
        }
    }
}