import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Cake[] cakes = new Cake[n];
		for (int i = 0; i < n; i++) {
		    cakes[i] = new Cake(new long[]{sc.nextLong(), sc.nextLong(), sc.nextLong()});
		}
		Cake.sw = new int[]{1, 1, 1};
		Arrays.sort(cakes);
		long max = getMax(cakes, m);
		Cake.sw = new int[]{-1, 1, 1};
		Arrays.sort(cakes);
		max = Math.max(max, getMax(cakes, m));
		Cake.sw = new int[]{1, -1, 1};
		Arrays.sort(cakes);
		max = Math.max(max, getMax(cakes, m));
		Cake.sw = new int[]{1, 1, -1};
		Arrays.sort(cakes);
		max = Math.max(max, getMax(cakes, m));
		System.out.println(max);
    }
    
    static long getMax(Cake[] cakes, int count) {
        long fore = 0;
        long reer = 0;
        for (int i = 0; i < count; i++) {
            fore += cakes[i].getValue();
            reer += cakes[cakes.length - i - 1].getValue();
        }
        return Math.max(Math.abs(fore), Math.abs(reer));
    }
    
    static class Cake implements Comparable<Cake> {
        static int[] sw;
        long[] values;
        
        public Cake(long[] values) {
            this.values = values;
        }
        
        public long getValue() {
            long ans = 0;
            for (int i = 0; i < 3; i++) {
                ans += sw[i] * values[i];
            }
            return ans;
        }
        
        public int compareTo(Cake another) {
            long x = getValue();
            long y = another.getValue();
            if (x == y) {
                return 0;
            } else if (x < y) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}

