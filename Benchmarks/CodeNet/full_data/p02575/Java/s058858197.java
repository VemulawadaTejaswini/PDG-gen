import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
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
        
        Set<Pair> ps = IntStream.range(0, W).mapToObj(Pair::new)
                .collect(HashSet::new, Set::add, Set::addAll);
        
        for (int i = 0; i < H; i++) {
            if (ps.isEmpty()) {
                System.out.println(-1);
                continue;
            }
            
            int min = Integer.MAX_VALUE;
            Iterator<Pair> itr = ps.iterator();
            
            while (itr.hasNext()) {
                Pair p = itr.next();
                
                if (cannotDown[i][0] <= p.end && p.end <= cannotDown[i][1]) {
                    if (cannotDown[i][1] == W - 1) {
                        itr.remove();
                        continue;
                    }
                    p.end = cannotDown[i][1] + 1;
                }
                if (p.gap() < min) {
                    min = p.gap();
                }
            }
            
            if (ps.isEmpty()) {
                System.out.println(-1);
            } else {
                System.out.println(min + i + 1);
            }
        }
    }
}
