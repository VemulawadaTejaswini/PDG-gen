import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        List<Limit> limitList = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            Limit thisLimit = new Limit(a, b);

            if (limitList.isEmpty()) {
                limitList.add(thisLimit);
            } else {
                boolean segregate = true;
                for (Limit l : limitList) {
                    if (l.upper >= thisLimit.lower && l.lower <= thisLimit.upper) {
                        segregate = false;
                        l.lower = IntStream.of(l.lower, thisLimit.lower).max().getAsInt();
                        l.upper = IntStream.of(l.upper, thisLimit.upper).min().getAsInt();
                        //System.out.println("Intersection found. intersection=" + l);
                    }
                }
                if (segregate) {
                    limitList.add(thisLimit);
                }
            }
           //System.out.println(limitList);
        }
        System.out.println(limitList.size());
    }
}

class Limit {
    int lower;
    int upper;
    Limit(int lower, int upper) {
        this.lower = lower;
        this.upper = upper;
    }

    @Override
    public String toString() {
        return "(" + lower + ", " + upper + ")";
    }
}