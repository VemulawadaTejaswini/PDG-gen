import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
public class Main {
    static final long MODVAL = 998244353L;
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
//        System.out.println(lunluns.size());
        List<Long> ll = new ArrayList<>();
        for(Long l : lunluns) {
            ll.add(l);
        }
        Collections.sort(ll);
        System.out.println(ll.get(K-1));
//        for(Long l : lunluns) {
//            System.out.println(l);
//        }
//        long hoge = sc.nextLong();
//        isRunrun(hoge);
//        try(
//                FileWriter fw = new FileWriter("data.txt");
//                PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
//        ) {
//            long target = 0L;
//            while(K>0) {
//                if(K%10000==0) {
//                    pw.println();
//                }
//                target++;
//                if(isRunrun(target)) {
//                    pw.print(String.format("%dL,", target));
//                    K--;
//                    continue;
//                }
//            }
//        } catch(IOException ie) {
//        }

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

    public static boolean isRunrun(long target) {
        int before = -1;
        while(target>0) {
            int tmp = (int)(target%10L);
            if(before!=-1 && (Math.abs(before-tmp)>1)) return false;
            before=tmp;
            target/=10;
        }
        return true;
    }

}
