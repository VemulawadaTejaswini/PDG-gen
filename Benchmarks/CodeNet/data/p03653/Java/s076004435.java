import java.util.*;

public class Main{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        int N = X + Y + Z;
        int [] A = new int [N];
        int [] B = new int [N];

        long ans = 0;

        for(int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
            int C = sc.nextInt();
            ans += C;
            A[i] -= C; B[i] -= C;
        }

        System.out.println(ans + calcAns(X,Y,N,A,B));
    }

    public static long calcAns(int X, int Y, int N, int [] A,int [] B) {
        // sort the items
        Item [] items = new Item [N];
        for(int i = 0; i < N; i++) {
            items[i] = new Item(A[i],B[i]);
        }
        Arrays.sort(items);

        // System.out.println(Arrays.toString(items));

        // use priority queue to calculate the ans
        long [] max = new long [N];
        long sum = 0;
        PriorityQueue < Integer > current = new PriorityQueue<>();
        for(int i = 0; i < N; i++) {
            sum += items[i].a;
            current.add(items[i].a);
            if(i >= X) {
                sum -= current.poll();
            }
            max[i] = sum;
        }

        current.clear();
        sum = 0;
        long ret = Long.MIN_VALUE;
        for(int i = 0; i < N; i++) {
            int idx = N - i - 1;
            sum += items[idx].b;
            current.add(items[idx].b);
            if(i >= Y) {
                sum -= current.poll();
            }
            if((N - idx >= Y) && (idx >= X)) {
                long sol;
                sol = sum + max[idx - 1];
                if(sol > ret) {
                    ret = sol;
                }
            }
        }
        return ret;
    }

    static class Item implements Comparable < Item > {
        int a,b;
        int diff;

        Item(int a, int b) {
            this.a = a;
            this.b = b;
            diff = b - a;
        }

        @Override
        public int compareTo(Item item) {
            return diff - item.diff;
        }

        @Override
        public String toString(){
            return "a:" + a + " b:" + b;
        }
    }
}
