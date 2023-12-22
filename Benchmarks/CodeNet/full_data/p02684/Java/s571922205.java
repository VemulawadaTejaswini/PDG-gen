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
        List<Integer> alreadyVisit = new ArrayList<>(n);
        Integer now = 1;
        while (!alreadyVisit.contains(now)) {
            alreadyVisit.add(now);
            now = teleport.apply(now);
        }
        int firstCount = alreadyVisit.indexOf(now);
        int loopCount = alreadyVisit.size() - firstCount;
        int meanCount = (int)((k-firstCount) % loopCount) + firstCount;
        if (meanCount > k) {
            meanCount = (int)k;
        }
        now = alreadyVisit.get(meanCount);
        System.out.println(now);
    }
}
