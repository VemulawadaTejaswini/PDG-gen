
import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        TreeSet<Double> set = new TreeSet<>();

        for(int i=0; i<n; i++) {
            set.add((double)sc.nextInt());
        }
        for(int i=0; i<m; i++) {
            double p = set.pollLast();
            set.add(p/2);
        }

        long res = 0;
        while(!set.isEmpty()) {
            res += Math.floor(set.pollFirst());
        }

        System.out.println(res);
    }

}
