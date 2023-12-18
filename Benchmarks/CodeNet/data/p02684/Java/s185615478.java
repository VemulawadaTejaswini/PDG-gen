import java.util.*;
import java.util.function.Function;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] ai = new int[n];
        for (int i=0; i<n; i++) {
            ai[i] = sc.nextInt();
        }

        Function<Integer, Integer> teleport = i -> ai[i-1];
        List<Integer> alreadyVisit = new ArrayList<>();
        Integer now = 1;
        alreadyVisit.add(now);
        for (long i=0; i<k; i++) {
            now = teleport.apply(now);
            if (alreadyVisit.contains(now)) {
                int firstCount = alreadyVisit.indexOf(now);
                int loopCount = alreadyVisit.size() - firstCount;
                now = alreadyVisit.get((int)((k-firstCount) % loopCount) + firstCount);
                break;
            } else {
                alreadyVisit.add(now);
            }
        }
        System.out.println(now);
    }
}