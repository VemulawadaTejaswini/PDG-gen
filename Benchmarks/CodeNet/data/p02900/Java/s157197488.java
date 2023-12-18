import java.util.*;

public class Main {
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long min = Math.min(a, b);
        List<Long> sets = new LinkedList<>();
        List<Long> sets2 = new LinkedList<>();
        long max = calc(a, b);
        for(long l = 1; l <= max; l++){
            boolean add = true;
            if(a % l == 0 && b % l ==0) {
                for(Long n : sets) {
                    if( n == 1 ) continue;
                    if(l % n == 0) {
                        add = false;
                        break;
                    }
                }
                if(add)sets.add(l);
            }
        }
        System.out.println(sets.size());
    }
    private static long calc(long a, long b) {
        if(a == b ) return a;
        if(a > b) return calc(a -b, b);
        return calc(a, b -a);
    }
}
