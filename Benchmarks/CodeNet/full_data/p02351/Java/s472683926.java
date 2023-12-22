import java.util.*;

public class Main {

    static int n;
    static long[] data;
    static long[] datb;

    static void add(int a, int b, int x, int k, int l, int r){
        if (a<=l && r<=b) data[k]+=x;
        else if (!(b<=l || r<=a)) {
            datb[k]+=(long)x*(Math.min(b, r)-Math.max(a, l));
            add(a, b, x, k*2+1, l, (l+r)/2);
            add(a, b, x, k*2+2, (l+r)/2, r);
        }
    }

    static long sum(int a, int b, int k, int l, int r) {
        if (a<=l && r<=b) return data[k]*(r-l)+datb[k];
        else if (!(b<=l || r<=a)) {
            long tmp = data[k]*(Math.min(b, r)-Math.max(a, l));
            tmp += sum(a, b, k*2+1, l, (l+r)/2);
            tmp += sum(a, b, k*2+2, (l+r)/2, r);
            return tmp;
        } else {
            return 0L;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n_ = sc.nextInt();
        n = 1;
        while(n<n_) n*=2;
        data = new long[2*n-1];
        datb = new long[2*n-1];

        int q = sc.nextInt();
        for (int qq=0;qq<q;qq++) {
            int com = sc.nextInt();
            if (com==0) {
                int s = sc.nextInt()-1;
                int t = sc.nextInt()-1;
                int x = sc.nextInt();
                add(s, t+1, x, 0, 0, n);
            } else { // com==1
                int s = sc.nextInt()-1;
                int t = sc.nextInt()-1;
                System.out.println(sum(s, t+1, 0, 0, n));
            }
        }
        // System.out.println(Arrays.toString(data));
        // System.out.println(Arrays.toString(datb));
    }
}
