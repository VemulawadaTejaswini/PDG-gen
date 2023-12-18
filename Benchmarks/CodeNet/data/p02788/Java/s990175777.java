import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        long D,A;
        N = sc.nextInt();
        D = sc.nextLong();
        A = sc.nextLong();
        long X, H;
        TreeMap<Long, Long> mp = new TreeMap<>();
        for(int i=0;i<N;i++){
            X = sc.nextLong();
            H = sc.nextLong();
            mp.put(X, H);
        }
        List<Long> keys = new ArrayList<>();
        for(Long k:mp.navigableKeySet()){
            keys.add(k);
        }
        long[] diffs = new long[N];
        Arrays.fill(diffs, 0);

        long damage = 0;
        long sum=0;
        int ind=0;
        for(Long k:keys){
//            System.out.println(mp);
//            for(long df:diffs){System.out.print(df);}System.out.println();
            damage += diffs[ind];
            mp.put(k, mp.get(k)-damage);
            if(mp.get(k) > 0){
                long cnt = ((mp.get(k) - 1) / A + 1);
                long killDmg = cnt * A;
                damage += killDmg;
                sum += cnt;
                Long to = mp.floorKey(k+2*D);
                int toInd = indexOf(keys, to);
                if(toInd+1 < N)
                    diffs[toInd+1] -= killDmg;
            }
            ind++;
        }
        System.out.println(sum);
    }

    private static int indexOf(List<Long> lst, Long val){
        int l=0;
        int r=lst.size()-1;
        while(l<r){
            int m=(l+r)/2;
            if(lst.get(m) < val){
                l=m+1;
            }else{
                r=m;
            }
        }
        return l;
    }
}

