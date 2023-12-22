import java.math.BigDecimal;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int MOD = 1000000007;

        int[] a = new int[n];
        PriorityQueue<Integer> pos = new PriorityQueue<>((x, y) -> y - x);
        PriorityQueue<Integer> neg = new PriorityQueue<>((x, y) -> x - y);
        PriorityQueue<Integer> neg2 = new PriorityQueue<>((x, y) -> y - x);

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            if(a[i] > 0){
                pos.add(a[i]);
            }else{
                neg.add(a[i]);
                neg2.add(a[i]);
            }
        }

        long ans = 1;

        if(pos.isEmpty() && k % 2 == 1){
            for(int i = 0; i < k; i++){
                ans *= neg2.poll();
                ans %= MOD;
            }
            System.out.println(MOD + ans);
            return;
        }

        long p = 1;
        long po = 1;
        if(pos.size() > 0){
            p = pos.poll();
            if(pos.size() > 0){
                po = p * pos.peek();
            }else{
                po = p;
            }
        }
        long ne = 1;
        if(neg.size() > 1){
            ne = neg.poll() * neg.poll();
        }

        for(int i = 0; i < k; i++){
            if(po > ne){
                ans *= p;
                ans %= MOD;
                if(pos.size() > 0){
                    p = pos.poll();
                    if(pos.size() > 0){
                        po = p * pos.peek();
                    }else{
                        po = p;
                    }
                }
            }else{
                ans *= ne;
                ans %= MOD;
                if(neg.size() > 1){
                    ne = neg.poll() * neg.poll();
                }
                i++;
            }
            //System.out.println(ans);
        }

        System.out.println(ans % 1000000007);

    }
}
