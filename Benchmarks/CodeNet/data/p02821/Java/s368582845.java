import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    private static List<Long> sums;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long M = sc.nextLong();
//        int[] A = new int[N];
//        for(int i=0;i<N;i++){A[i]=sc.nextInt();}
        sums = new ArrayList<>(N);
        List<Long> A = Stream.generate(sc::nextLong)
                .limit(N)
                .sorted()
                .collect(Collectors.toList());
        long nowSum = 0;
        for(int i=A.size()-1;i>=0;i--){
            nowSum += A.get(i);
            sums.add(nowSum);
        }

        long l=0;
        long r=10_000_000_000_000_000L;
        while(l<r){
            long m = (l+r)/2;
//            System.out.println(m + ":"+getTotalNumOver(A, m));
            if(getTotalNumOver(A, m) > M){
                l = m+1;
            }else{
                r = m;
            }
        }
        long cnt = getTotalNumOver(A,l);
        final long tgtSum = l;
        long sum = 0;
        sum += (l-1) * (M-cnt);

//        assert(getSumOver(A, 67, 34) == 135);
//        assert(getSumOver(A, 67, 10) == 0);
        //l以上な和をすべて足したもの。
        sum += A.stream().mapToLong(
                p->getSumOver(A, tgtSum, p)
        ).sum();
        System.out.println(sum);
    }

    private static long getSumOver(List<Long> lst, long maxsum, long p){
        long tgt = maxsum-p;
        int l=0;
        int r=lst.size()-1;
        while(l<r){
            int m=(l+r)/2;
            if(tgt > lst.get(m)){
                l = m+1;
            }else{
                r = m;
            }
        }
        if(tgt > lst.get(l)){
            return 0;
        }
        return getSumAft(lst, l) + p * (lst.size()-l);

    }
    private static long getSumAft(List<Long> lst, int ind){
        //returns sum after index inclusive.
        return sums.get(lst.size()-ind-1);
    }

    private static long getTotalNumOver(List<Long> lst, long tgt){
        return lst.stream().mapToLong(
                p -> getCountOver(lst, tgt - p)
        ).sum();
    }

    private static long getCountOver(List<Long> lst, long tgt){
        int l=0;
        int r=lst.size()-1;
        while(l<r){
            int m=(l+r)/2;
            if(tgt > lst.get(m)){ // tgt > lst[m]
                l=m+1;
            }else{
                r=m;
            }
        }
        if(tgt > lst.get(l)){
            return 0;
        }else {
            return lst.size()-l;
        }
    }
}
