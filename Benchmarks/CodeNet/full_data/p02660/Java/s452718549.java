import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Map<Long, Integer> cntMap = new HashMap<>();
        long N = sc.nextLong();
        if(N == 1){
            System.out.println("0");
            return;
        }
        long lim = (long) (Math.sqrt(N)+3);
        for(long i=2;i<=lim;i++){
            if(N % i == 0){
                while(N % i == 0) {
                    N /= i;
                    cntMap.putIfAbsent(i, 0);
                    cntMap.put(i, cntMap.get(i) + 1);
                }
            }
        }
        if(cntMap.size() == 0){
            System.out.println(1);
            return;
        }
        int cnt=0;
        for(int size:cntMap.values()){
            int s = size;
            int now = 1;
            while(s >= now) {
                s -= now;
                now++;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
