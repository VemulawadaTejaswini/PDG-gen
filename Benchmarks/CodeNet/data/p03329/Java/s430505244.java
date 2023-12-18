import java.util.*;

public class Main {
    static Map<Integer,Integer> dp = new HashMap<>();
    static List<Integer> depos = new ArrayList<>();

    static void doDepo(int n){
        List<Integer> ans = new ArrayList();
        for(int v : depos){
            if(n == v){
                dp.put(n,1);
                return;
            }else if(n > v){
                ans.add(dp.get(n-v) + 1);
            }
        }
        int result = ans.stream().min((a, b) -> a.compareTo(b)).get();
        dp.put(n,result);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();

        // 引出可能金額準備
        depos.add(1);
        int d = 6;
        while(d <= 100000){
            depos.add(d);
            d = d * 6;
        }
        d = 9;
        while(d <= 100000){
            depos.add(d);
            d = d * 9;
        }
        // dp準備
        for(int i = 1; i <= 100000; i++){
            doDepo(i);
        }
        // 回答
        System.out.println(dp.get(v));
    }
}