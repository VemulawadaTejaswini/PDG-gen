import java.math.BigDecimal;
import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Integer max_len = s.length();
        int[] n_mod = new int[max_len];
        Map<Integer, Integer> map = new HashMap<>(); 

        BigDecimal mod = new BigDecimal(2019);
        for(int i=max_len-1;i>=0;i--){
            String subs = s.substring(i, max_len);
            BigDecimal obj = new BigDecimal(subs);
            BigDecimal remain = obj.remainder(mod);
            n_mod[i] = remain.intValue();
            // System.out.println(n_mod[i]);
            if(map.containsKey(n_mod[i])){
                map.put(n_mod[i], map.get(n_mod[i])+1);
            }
            else{
                map.put(n_mod[i], 1);
            }
        }

        int count = 0;

        for(Integer key : map.keySet()){
            Integer val = map.get(key);
            if(key==0)count+=val;
            if(val==1)continue;
            count += (val-1)*val/2;
        }
        System.out.println(count);
    }
}
