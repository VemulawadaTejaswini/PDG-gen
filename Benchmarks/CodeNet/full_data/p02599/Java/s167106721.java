import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Main {
    static int SIZE = 500001;
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        int[] l = new int[q];
        int[] r = new int[q];
        for (int i = 0; i < q; i++) {
            l[i] = sc.nextInt() - 1;
            r[i] = sc.nextInt() - 1;
        }
        
        List<int[]>[] queries = new List[n];
        for (int i = 0; i < n; i++) {
            queries[i] = new ArrayList<int[]>();
        }
        for (int i = 0; i < q; i++) {
            queries[l[i]].add(new int[]{r[i], i});
        }
        
        List<Integer>[] rights = new List[n];
        for (int i = 0; i < n; i++) {
            rights[i] = new ArrayList<Integer>();
        }
        int[] last_app = new int[SIZE];
        Arrays.fill(last_app, -1);
        for (int i = 0; i < n; i++) {
            int num = array[i];
            if (last_app[num] != -1) {
                rights[last_app[num]].add(i);
            }
            last_app[num] = i;
        }
        
        BIT bit = new BIT(SIZE);
        
        int[] ans = new int[q];
        for (int i = n - 1; i >= 0; i--) {
            for (Integer right : rights[i]) {
                bit.add(right, 1);
            }
            
            for (int[] query : queries[i]) {
                int left = i;
                int right = query[0];
                int q_idx = query[1];
                ans[q_idx] = right - left + 1 - (int)bit.sum(right);
            }
        }
        
        for (Integer a : ans) {
            System.out.println(a);
        }
    }
}

class BIT {
    int n;
    long[] d;

    // 単位元で埋めて新規作成
    public BIT(int n) {
        this.n = n;
        this.d = new long[n + 1];
    }
    
    public void add(int i, long x) {
        for (i++; i <= n; i += i&-i) {
            d[i] += x;
        }
    }
    
    public long sum(int i) {
        long x = 0;
        for (i++; i > 0; i -= i&-i) {
            x += d[i];
        }
        return x;
    }
    
    public long sum(int l, int r) {
        return sum(r-1) - sum(l-1);
    }
}