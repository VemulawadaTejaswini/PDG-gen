import java.util.*;

public class Main {

    static long[] a,b,c;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int k = sc.nextInt();
         a = new long[x];
         b = new long[y];
         c = new long[z];
        for (int i = 0; i < x; i++) a[i] = sc.nextLong();
        for (int i = 0; i < y; i++) b[i] = sc.nextLong();
        for (int i = 0; i < z; i++) c[i] = sc.nextLong();
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        PriorityQueue<Pack> q = new PriorityQueue<>((p1,p2) -> Long.compare(p2.sum, p1.sum));
        Pack fir = new Pack(0, 0, 0, a[x-1] + b[y-1] + c[z-1]);
        q.add(fir);
        Set<Pack> set = new HashSet<>();
        set.add(fir);
        StringBuilder ans = new StringBuilder();
        Pack ap, bp, cp;
        for (int i = 0; i < k; i++) {
            Pack pre = q.poll();
            ans.append(pre.sum).append("\n");
            int ai = pre.aidx;
            int bi = pre.bidx;
            int ci = pre.cidx;
            if(ai+1<x) {
                ap = new Pack(ai+1, bi, ci, a[x-1-(ai+1)] + b[y-1-bi] + c[z-1-ci]);
                if (!set.contains(ap)) {
                    q.add(ap); set.add(ap);
                }
            }
            if(bi+1<y){
                bp = new Pack(ai, bi+1, ci, a[x-1-ai] + b[y-1-(bi+1)] + c[z-1-ci]);
                if(!set.contains(bp)){
                    q.add(bp); set.add(bp);
                }
            }
            if(ci+1<z){
                cp = new Pack(ai, bi, ci+1, a[x-1-ai] + b[y-1-bi] + c[z-1-(ci+1)]);
                if(!set.contains(cp)){
                    q.add(cp); set.add(cp);
                }
            }
        }

        System.out.println(ans.toString());
        sc.close();
    }

}

class Pack{
    public long sum;
    public int aidx;
    public int bidx;
    public int cidx;

    public Pack(int aidx, int bidx, int cidx, long sum){
        this.aidx = aidx;
        this.bidx = bidx;
        this.cidx = cidx;
        this.sum = sum;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Pack p = (Pack)o;
        return this.aidx == p.aidx && this.bidx == p.bidx && this.cidx == p.cidx;
    }

    @Override
    public int hashCode() {
        return Objects.hash(aidx, bidx, cidx);
    }
}
