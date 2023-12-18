import java.util.*;

public class Main {
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long min = Math.min(a, b);
        List<Long> sets = new LinkedList<>();
        List<Long> sets2 = new LinkedList<>();
        for(long l = 1; l <= min; l++){
            if(a % l == 0 && b % l ==0) sets.add(l);
        }

        for(Long n : sets) {
            boolean ba = true;
            dd : for(Long d : sets2) {
                long m = Math.min(n, d);
                for(long l = 2; l <= m; l++){
                    if(d % l == 0 && n % l ==0){
                        ba = false;
                        break dd;
                    }
                }
            }
            if(ba) sets2.add(n);
        }
        System.out.println(sets2.size());
    }

}
