import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long lbase = 0;
        long rbase = 0;
        TreeSet<Long> lindex = new TreeSet<>();
        TreeSet<Long> rindex = new TreeSet<>();
        long[] l = new long[N];
        long[] w = new long[N];
        for(int i=0;i<N;++i){
            l[i] = scan.nextLong();
            w[i] = scan.nextLong()-l[i];
        }
        lindex.add(l[0]);rindex.add(l[0]);
        //傾きが１ではなければ？
        long ans = 0;
        for(int i=1;i<N;++i){
            lbase += w[i];
            rbase += w[i-1];

            if(lindex.ceiling(l[i]+lbase) != null){
                lindex.add(l[i]+lbase);
                long top = lindex.pollLast();
                long next= lindex.last();
                ans += Math.abs(top-next);
                rindex.add(top-lbase - rbase);
            }else if(rindex.floor(l[i]-rbase) != null){
                rindex.add(l[i]-rbase);
                long bot = rindex.pollFirst();
                long next= rindex.first();
                ans += Math.abs(bot-next);
                lindex.add(bot+rbase+lbase);
            }else{
                lindex.add(l[i]+lbase);
                rindex.add(l[i]-rbase);
            }
        }
        System.out.println(ans);
    }
}