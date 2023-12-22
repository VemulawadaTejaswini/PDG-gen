import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long x = in.nextLong();
        long m = in.nextLong();
        List<Long> foundList = new ArrayList<>();
        Set<Long> foundSet = new HashSet<>();
        
        long a = x;
        long ans = a;
        foundList.add(Long.MIN_VALUE); // 0番目はダミーの値。便宜上。
        foundList.add(a);
        foundSet.add(a);
        for(long i=2; i<=n; i++) {
            long next = (a*a)%m;
            foundList.add(next);
            if(foundSet.contains(next)) {
                // ループ検出
                // 何番目からi番目までがループであるのかを知る
                int loopStart = foundList.indexOf(next); // これがintに収まるということは未証明
                int loopEnd = (int)i-1;
                long loopCycle = loopEnd - loopStart + 1;
                long loopLength = n - loopStart + 1;
                long loopMod = loopLength % loopCycle;
                long loopCount = (loopLength - loopMod) / loopCycle;
                loopCount--; // ループ1回分は既にansに足されているので
                
                long loopSum = 0;
                for(int j=loopStart; j<=loopEnd; j++) {
                    loopSum += foundList.get(j);
                }
                if(loopCount>0) {
                    ans += loopCount*loopSum;
                }
                for(int j=loopStart; j<loopStart+loopMod; j++) {
                    ans += foundList.get(j);
                }
                break;
            }
            else {
                foundSet.add(next);
            }
            ans += next;
            a = next;
        }
        System.out.println(ans);
    }
}
