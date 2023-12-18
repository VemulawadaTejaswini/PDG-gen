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
        PriorityQueue<Pack> q = new PriorityQueue<>(new Comparator<Pack>() {
            public int compare(Pack p1, Pack p2) {
                if(p2.sum > p1.sum) return 1;
                else if(p2.sum == p1.sum) return 0;
                else return -1;
            };
        });
        q.add(new Pack(0, 0, 0, a[x-1] + b[y-1] + c[z-1]));
        boolean[][][] used = new boolean[x][y][z];
        used[0][0][0] = true;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < k; i++) {
            Pack pre = q.poll();
            ans.append(pre.sum + "\n");
            if(pre.aidx+1<x && !used[pre.aidx+1][pre.bidx][pre.cidx]){
                q.add(new Pack(pre.aidx+1, pre.bidx, pre.cidx, a[x-1-(pre.aidx+1)] + b[y-1-pre.bidx] + c[z-1-pre.cidx]));
                used[pre.aidx+1][pre.bidx][pre.cidx] = true;
            }
            if(pre.bidx+1<y && !used[pre.aidx][pre.bidx+1][pre.cidx]){
                q.add(new Pack(pre.aidx, pre.bidx+1, pre.cidx, a[x-1-pre.aidx] + b[y-1-(pre.bidx+1)] + c[z-1-pre.cidx]));
                used[pre.aidx][pre.bidx+1][pre.cidx] = true;
            }
            if(pre.cidx+1<z && !used[pre.aidx][pre.bidx][pre.cidx+1]){
                q.add(new Pack(pre.aidx, pre.bidx, pre.cidx+1, a[x-1-pre.aidx] + b[y-1-pre.bidx] + c[z-1-(pre.cidx+1)]));
                used[pre.aidx][pre.bidx][pre.cidx+1] = true;
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
}
