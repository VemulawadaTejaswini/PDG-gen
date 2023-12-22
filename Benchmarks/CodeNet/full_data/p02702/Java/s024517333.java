import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Integer max_len = s.length();
        int[] n_mod = new int[max_len+1];
        int[] map2019 = new int[2019];
        int pow = 1;
        for(int i=max_len-1;i>=0;i--){
            Integer num = Integer.valueOf(s.substring(i, i+1));
            Integer tmp = (num*pow + n_mod[i+1])%2019;
            n_mod[i] = tmp;
            map2019[tmp]+=1;
            pow *= 10;
            pow %= 2019;
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
