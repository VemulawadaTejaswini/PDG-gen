import java.math.BigDecimal;
import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Integer max_len = s.length();

        BigDecimal mod = new BigDecimal(2019);
        int[] map2019 = new int[2019];
        for(int i=max_len-1;i>=0;i--){
            String subs = s.substring(i, max_len);
            BigDecimal obj = new BigDecimal(subs);
            BigDecimal remain = obj.remainder(mod);
            Integer tmp = remain.intValue();
            map2019[tmp]++;
        }

        int count = map2019[0];
        for(int i=0;i<2019;i++){
            Integer num = map2019[i];
            if(num<2)continue;
            count += num*(num-1)/2;
        }
        System.out.println(count);
    }
}
