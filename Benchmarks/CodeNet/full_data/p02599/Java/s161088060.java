import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] col = new int[n+1];
        for(int i=1; i<=n; i++) {
            col[i] = Integer.parseInt(sc.next());
        }

        int[] last = new int[n + 1];
        BIT bit = new BIT(n);

        int[] res = new int[q];
        List<Pair> list = new ArrayList<>();
        for(int i=0; i<q; i++) {
            list.add(new Pair(Integer.parseInt(sc.next()), Integer.parseInt(sc.next()), i));
        }
        list.sort((a, b) -> Integer.compare(a.r, b.r));

        int pos = 0;
        int sum = 0;
        for(Pair p : list) {
            while(pos < p.r) {
                int c = col[pos+1];
                if(last[c] >= 1) {
                    bit.add(last[c], -1);
                    sum--;
                }
                bit.add(pos+1, 1);
                sum++;
                last[c] = pos+1;
                pos++;
            }
            res[p.i] = sum - bit.sum(p.l-1);
        }
        for(int i=0 ;i<q; i++) {
            System.out.println(res[i]);
        }


    }

    static class Pair {
        int l;
        int r;
        int i;
        Pair(int l, int r, int i) {
            this.l = l;
            this.r = r;
            this.i = i;
        }
    }

    static class BIT {
        int n ;
        int[] bit;

        BIT(int n) {
            this.n = n;
            bit = new int[n+1];
        }

        void add(int i, int num) {
            while(i <= n) {
                bit[i] += num;
                int lsb =  i & (-i);
                i += lsb;
            }
        }

        int sum(int i) {
            int sum = 0;
            while(i > 0) {
                sum += bit[i];
                int lsb =  i & (-i);
                i -= lsb;
            }
            return sum;
        }

        int sum(int l, int r) {
            return sum(r) - sum(l-1);
        }
    }


}
