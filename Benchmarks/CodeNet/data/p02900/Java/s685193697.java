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
            boolean add = true;
            if(a % l == 0 && b % l ==0) {
                if(l > 2) {
                    if(l % 2 == 0) continue;
                }
                det : for(Long n : sets) {
                    long m = Math.min(n, l);
                    for(long l2 = 3; l2 <= m; l2++){
                        if(l % l2 == 0 && n % l2 ==0){
                            add = false;
                            break det;
                        }
                    }
                }
                if(add)sets.add(l);
            }
        }
        System.out.println(sets.size());
    }

}
