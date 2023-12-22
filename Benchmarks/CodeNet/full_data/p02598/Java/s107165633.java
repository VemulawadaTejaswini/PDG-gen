import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    
    private static class Maruta {
        private final double originalLen;
        private int cuts = 0;
        private double len;
        
        private Maruta(int originalLen) {
            this.originalLen = originalLen;
            this.len = originalLen;
        }
        
        public void cut() {
            cuts++;
            len = originalLen / (cuts + 1);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int N = sc.nextInt();
        final int K = sc.nextInt();
        final int[] As = new int[N];
        
        TreeSet<Maruta> ms = new TreeSet<>(Comparator.comparing(m -> m.len));
        for (int i = 0; i < N; i++) {
            As[i] = sc.nextInt();
            ms.add(new Maruta(As[i]));
        }
        
        for (int i = 0; i < K; i++) {
            Maruta longest = ms.pollLast();
            longest.cut();
            ms.add(longest);
        }
        
        int result = (int) Math.ceil(ms.last().len);
        System.out.println(result);
    }
}
