import java.util.*;

public class Main {
    static int n;
    static long d;
    static long[] a;
    static int count;
    static boolean[] use;
    static PriorityQueue<Long[]> pque;
    static ArrayList<Long[]> llist;
    static ArrayList<Long[]> rlist;
    static ArrayList<Integer>[] from;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        d = sc.nextLong();
        a = new long[n];
        use = new boolean[n];
        count = 0;
        for(int i=0; i<n; i++) a[i] = sc.nextLong();

        llist = new ArrayList<Long[]>();
        rlist = new ArrayList<Long[]>();
        for(int i=0; i<n; i++){
            llist.add(new Long[]{(long)i, d*(n-1-i)+a[i]});
            rlist.add(new Long[]{(long)i, d*i+a[i]});
        }
        Collections.sort(llist, (a, b) -> Long.compare(a[1], b[1]));
        Collections.sort(rlist, (a, b) -> Long.compare(a[1], b[1]));

        from = new ArrayList[n];
        for(int i=0; i<n; i++){
            from[i] = new ArrayList<Integer>();
        }

        long ans = 0;
        pque = new PriorityQueue<Long[]>((a, b) -> Long.compare(a[1], b[1]));
        pque.add(new Long[]{n/2L, 0L});
        while(count < n){
            Long[] now = pque.poll();
            int pos = (int)((long)now[0]); 
            long cost = (long)now[1];
            if(!use[pos]){
                ans += cost;
                add(pos);
                use[pos] = true;
                count++;
                for(int i=0; i<from[pos].size(); i++){
                    add(from[pos].get(i));
                }
            }
        }

        System.out.println(ans);
    }

    static void add(int pos){
        int count = 0;
        while(count < llist.size()){
            Long[] now = llist.get(count);
            int mpos = (int)((long)now[0]);
            // long mcost = (long)now[1];
            if(use[mpos]){
                llist.remove(count);
            }else{
                if(mpos >= pos){
                    count++;
                    continue;
                }else{
                    pque.add(new Long[]{(long)mpos, (pos-mpos)*d+a[pos]+a[mpos]});
                    from[mpos].add(pos);
                    break;
                }
            }
        }

        count = 0;
        while(count < rlist.size()){
            Long[] now = rlist.get(count);
            int mpos = (int)((long)now[0]);
            // long mcost = (long)now[1];
            if(use[mpos]){
                rlist.remove(count);
            }else{
                if(mpos <= pos){
                    count++;
                    continue;
                }else{
                    pque.add(new Long[]{(long)mpos, (mpos-pos)*d+a[pos]+a[mpos]});
                    from[mpos].add(pos);
                    break;
                }
            }
        }


        // for(int i=pos+1; i<n; i++){
        //     pque.add(new Long[]{(long)i, (i-pos)*d+a[pos]+a[i]});
        // }
        // for(int i=pos-1; i>=0; i--){
        //     pque.add(new Long[]{(long)i, (pos-i)*d+a[pos]+a[i]});
        // }
    }
}