import java.math.BigDecimal;
import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Integer max_len = s.length();
        int[] n_mod = new int[max_len];
        int[] map2019 = new int[2019];
        int pow = 10;
        n_mod[max_len-1] = Integer.valueOf(s.substring(max_len-1, max_len));
        for(int i=max_len-2;i>=0;i--){
            Integer num = Integer.valueOf(s.substring(i, i+1));
            pow %= 2019;
            Integer tmp = (num*pow + n_mod[i+1])%2019;
            n_mod[i] = tmp;
            map2019[tmp]++;
            pow *= 10;
        }

        Long count = (long)map2019[0];
        for(int i=0;i<2019;i++){
            Integer num = map2019[i];
            if(num<2)continue;
            count += num*(num-1)/2;
        }
        System.out.println(count);
    }
}
