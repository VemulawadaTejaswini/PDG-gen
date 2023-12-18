import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Main{

    static void add(Map<Long, Integer> cnt, long index){
        if(!cnt.containsKey(index))cnt.put(index, 0);
        cnt.put(index, cnt.get(index)+1);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long lbase = 0;
        long rbase = 0;
        Map<Long,Integer> lcnt = new HashMap<>();
        Map<Long, Integer> rcnt=new HashMap<>();
        TreeSet<Long> lindex = new TreeSet<>();
        TreeSet<Long> rindex = new TreeSet<>();
        long[] l = new long[N];
        long[] w = new long[N];
        for(int i=0;i<N;++i){
            l[i] = scan.nextLong();
            w[i] = scan.nextLong()-l[i];
        }
        lindex.add(l[0]);rindex.add(l[0]);
        add(lcnt, l[0]);add(rcnt, l[0]);
        long ans = 0;
        for(int i=1;i<N;++i){
            lbase += w[i];
            rbase += w[i-1];
            if(lindex.ceiling(l[i]+lbase) != null){
                lindex.add(l[i]+lbase);
                add(lcnt, l[i]+lbase);
                long top = lindex.last();
                ans += Math.abs(top-(l[i]+lbase));
                lcnt.put(top, lcnt.get(top)-1);
                if(lcnt.get(top)==0){
                    lindex.pollLast();
                    rindex.add(top-lbase - rbase);
                    add(rcnt, top-lbase-rbase);
                }
            }else if(rindex.floor(l[i]-rbase) != null){
                rindex.add(l[i]-rbase);
                add(rcnt, l[i]-rbase);
                long bot = rindex.first();
                ans += Math.abs(bot-(l[i]-rbase));
                rcnt.put(bot, rcnt.get(bot)-1);
                if(rcnt.get(bot)==0){
                    rindex.pollFirst();
                    lindex.add(bot+rbase+lbase);
                    add(lcnt, bot+rbase+lbase);
                }
            }else{
                lindex.add(l[i]+lbase);
                rindex.add(l[i]-rbase);
                add(lcnt, l[i]+lbase);
                add(rcnt, l[i]-rbase);
            }
        }
        System.out.println(ans);
    }
}