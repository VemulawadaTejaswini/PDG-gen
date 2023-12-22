import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    
    private static class Pair {
        private int start;
        private int end;
        
        private Pair(int start) {
            this.start = start;
            this.end = start;
        }
        
        private int gap() {
            return end - start;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int H = sc.nextInt();
        final int W = sc.nextInt();
        
        final int[][] cannotDown = new int[H][2];
        
        for (int i = 0; i < H; i++) {
            cannotDown[i][0] = sc.nextInt() - 1;
            cannotDown[i][1] = sc.nextInt() - 1;
        }
        
        Set<Pair> ps = new HashSet<>(
                IntStream.range(0, W).mapToObj(Pair::new).collect(Collectors.toSet()));
        
        for (int i = 0; i < H; i++) {
            final int ii = i;
            
            if (ps.isEmpty()) {
                System.out.println(-1);
                continue;
            }
            
            // atcoderでStreamは遅いのでループでやる
            Iterator<Pair> itr = ps.iterator();
            Map<Integer, Pair> retainee = new HashMap<>();
            
            while (itr.hasNext()) {
                Pair p = itr.next();
                if (cannotDown[ii][0] <= p.end && p.end <= cannotDown[ii][1]) {
                    p.end = cannotDown[i][1] + 1;
                }
                
                if (W <= p.end) {
                    itr.remove();
                    
                } else if (!retainee.containsKey(p.end)) {
                    retainee.put(p.end, p);
                    
                } else {
                    Pair o = retainee.get(p.end);
                    if (o.start < p.start) {
                        retainee.put(p.end, p);
                    }
                }
            }
            ps.retainAll(retainee.values());
            
            if (ps.isEmpty()) {
                System.out.println(-1);
            } else {
                int min = ps.stream().mapToInt(Pair::gap).min().getAsInt();
                System.out.println(min + i + 1);
            }
        }
    }
}
