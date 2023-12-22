
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    
    private static class Target {
        private final int h;
        private final int w;
        
        private Target(int h, int w) {
            this.h = h;
            this.w = w;
        }
        
        @Override
        public boolean equals(Object o) {
            if (o instanceof Target) {
                Target t = (Target) o;
                return h == t.h && w == t.w;
            }
            return false;
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(h, w);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int H = sc.nextInt();
        final int W = sc.nextInt();
        final int M = sc.nextInt();
        
        Set<Target> targets = new HashSet<>();
        for (int i = 0; i < M; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            targets.add(new Target(h, w));
        }
        
        Map<Integer, Long> hCounts = targets.stream()
                .collect(Collectors.groupingBy(t -> t.h, Collectors.counting()));
        Map<Integer, Long> wCounts = targets.stream()
                .collect(Collectors.groupingBy(t -> t.w, Collectors.counting()));
        
        long max = hCounts.entrySet().stream().flatMapToLong(
                hs -> wCounts.entrySet().stream().mapToLong(
                        ws -> {
                            Target target = new Target(hs.getKey(), ws.getKey());
                            long count = hs.getValue() + ws.getValue();
                            if (targets.contains(target)) {
                                count--;
                            }
                            return count;
                        }))
                .max().getAsLong();
        
        System.out.println(max);
    }
}
