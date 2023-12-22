import java.math.BigDecimal;
import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Integer max_len = s.length();
        int[] n_mod = new int[max_len];

        BigDecimal mod = new BigDecimal(2019);
        for(int i=max_len-1;i>=0;i--){
            String subs = s.substring(i, max_len);
            BigDecimal obj = new BigDecimal(subs);
            BigDecimal remain = obj.remainder(mod);
            n_mod[i] = remain.intValue();
            // System.out.println(n_mod[i]);
        }

        int[] check = new int[max_len];
        int count = 0;
        for(int i=0;i<max_len-3;i++){
            if(check[i]==1)continue;
            int c = 0;
            int sum = 0;
            for(int j=i+1;j<max_len;j++){
                if(n_mod[i]==n_mod[j]){
                    sum++;
                    c += sum;
                    check[j] = 1;
                }
            }
            if(n_mod[i]==0){
                if(sum==0)sum=1;
                count += sum;
            }
            
            count += c;
        }
        System.out.println(count);
    }
}
