import java.math.BigDecimal;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

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

        BigDecimal ans = new BigDecimal(1);

        for(int i = 0; i < k - 1; i++){
            int p = 1;
            if(!pos.isEmpty()){
                p = pos.peek();
            }
            int ne = 1;
            if(!neg.isEmpty()){
                ne = -neg.peek();
            }

            if(p > ne){
                ans = ans.multiply(new BigDecimal(pos.poll()));
            }else{
                ans = ans.multiply(new BigDecimal(neg.poll()));
            }
        }


        if(ans.compareTo(new BigDecimal(0)) > 0){
            if(!pos.isEmpty()){
                ans = ans.multiply(new BigDecimal(pos.poll()));
            }else{
                ans = new BigDecimal(1);
                for(int i = 0; i < k; i++){
                    ans = ans.multiply(new BigDecimal(neg2.poll()));
                }

            }
        }else{
            if(!neg.isEmpty()){
                ans = ans.multiply(new BigDecimal(neg.poll()));
            }else{
                ans = new BigDecimal(1);
                for(int i = 0; i < k; i++){
                    ans = ans.multiply(new BigDecimal(neg2.poll()));
                }

            }

        }


        System.out.println(ans.remainder(new BigDecimal(1000000007)));

    }
}
