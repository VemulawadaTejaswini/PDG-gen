import java.util.*;
public class Main {
    static Set<Long> lunluns = new HashSet<>();
    static long ketas[] = {
            0L, 1L, 10L, 100L, 1000L, 10000L, 100000L, 1000000L, 10000000L, 100000000L, 1000000000L, 10000000000L, 100000000000L, 1000000000000L, 10000000000000L,
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        for(int i=0; i<10; i++) {
            addLunlun(i, 1, i);
        }
        List<Long> ll = new ArrayList<>();
        for(Long l : lunluns) {
            ll.add(l);
        }
        Collections.sort(ll);
        System.out.println(ll.get(K-1));
    }

    public static void addLunlun(long target, int keta, int lead) {
        if(target>3234566667L) return;
        if(keta > 10) return;
        if(lead>0) {
            addLunlun(target + ketas[keta+1] * (lead-1), keta+1, lead-1);
        }
        addLunlun(target+ketas[keta+1]*lead, keta+1, lead);
        if(lead<9) {
            addLunlun(target+ketas[keta+1]*(lead+1), keta+1, lead+1);
        }
        if(0L!=target) lunluns.add(target);
    }
}
