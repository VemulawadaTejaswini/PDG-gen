import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Main{

    static class Pair{
        long index;
        int cnt;
        Pair(long index,int cnt){this.index=index;this.cnt=cnt;}
    }

    static void add(TreeSet<Pair> indexes, long ind){
        Pair p = new Pair(ind, 1);
        if(indexes.ceiling(p)==null || indexes.ceiling(p).index != ind){
            indexes.add(p);
        }else{
            indexes.ceiling(p).cnt++;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long lbase = 0;
        long rbase = 0;
        TreeSet<Pair> lindex = new TreeSet<>((a,b)->a.index-b.index<0 ? -1:a.index==b.index ? 0: 1);
        TreeSet<Pair> rindex = new TreeSet<>((a,b)->b.index-a.index<0 ? -1:a.index==b.index ? 0: 1);
        long[] l = new long[N];
        long[] w = new long[N];
        for(int i=0;i<N;++i){
            l[i] = scan.nextLong();
            w[i] = scan.nextLong()-l[i];
        }
        lindex.add(new Pair(l[0],1));rindex.add(new Pair(l[0],1));
        long ans = 0;
        for(int i=1;i<N;++i){
            lbase += w[i];
            rbase += w[i-1];
            if(lindex.last().index >= (l[i]+lbase)){
                add(lindex, l[i]+lbase);
                lindex.last().cnt--;
                ans += Math.abs(lindex.last().index-(l[i]+lbase));
                if(lindex.last().cnt==0){
                    add(rindex, lindex.last().index-lbase-rbase);
                    lindex.pollLast();
                }
            }else if(rindex.last().index <= (l[i]-rbase)){
                add(rindex, l[i]-rbase);
                rindex.last().cnt--;
                ans += Math.abs(rindex.last().index-(l[i]-rbase));
                if(rindex.last().cnt==0){
                    add(lindex, rindex.last().index+lbase+rbase);
                    rindex.pollLast();
                }
            }else{
                add(lindex, l[i]+lbase);
                add(rindex, l[i]-rbase);
            }
        }
        System.out.println(ans);
    }
}