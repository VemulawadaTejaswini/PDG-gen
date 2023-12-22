import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            int ai = sc.nextInt();
            a[i] = ai;
            if(map.containsKey(ai)){
                map.put(ai, map.get(ai) + 1);
            }else{
                map.put(ai, 1);
            }
        }

        int ans = 0;

        next:
        for(int i = 0; i < n; i++){
            List<Integer> prime = divisor(a[i]);
            if(map.get(a[i]) > 1){
                continue next;
            }
            for(Integer l : prime){
                if(map.containsKey(l) && l != a[i]){
                    continue next;
                }
            }
            ans++;
        }

        System.out.println(ans);

    }

    static List<Integer> divisor(int n){
        List<Integer> result = new ArrayList<>();
        List<Integer> reverse = new ArrayList<>();
        int i = 0;
        long sqrt = (long)Math.ceil(Math.sqrt(n));
        while(++i < sqrt){
            if(n % i == 0){
                result.add(i);
                reverse.add(n / i);
            }
        }
        if(i * i == n){
            result.add(i);
        }
        Collections.reverse(reverse);
        result.addAll(reverse);
        return result;
    }

}
