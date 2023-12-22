import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Set<Integer> avail = new HashSet<>();
        Set<Integer> diffs = new HashSet<>();
        for(int i=1;i<=N;i++){
            avail.add(i);
        }
        int diff = 1;
        int cnt=0;
        while(cnt < M){
            Integer ta=-1;
            Integer tb=-1;
            while(diffs.contains(diff)){
                diff++;
                diff %= N;
            }
            for(Integer a:avail){
                if(avail.contains((a+diff) % N)){
                    ta = a;
                    tb = (a+diff) % N;
                    break;
                }
            }
            if(ta == -1){
                diff++;
                continue;
            }
            avail.remove(ta);
            avail.remove(tb);
            diffs.add(diff);
            diffs.add(N-diff);
            cnt++;
            System.out.println(ta + " " + tb);
        }
    }
}
