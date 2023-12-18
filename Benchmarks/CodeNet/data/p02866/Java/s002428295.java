import java.util.*;
//import java.math.BigDecimal;

public class B{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] m = new int[n];
        long answer = 1;
        //BigDecimal answer = BigDecimal.valueOf(1);

        if(sc.nextInt() != 0) answer = 0;
        //if(sc.nextInt() != 0) answer = BigDecimal.valueOf(0);
        else m[0]++;
        for(int i = 1; i < n; i++){
            int x;
            if((x = sc.nextInt()) == 0){
                answer = 0;
                //answer = BigDecimal.valueOf(0);
                break;
            }
            m[x]++;
        }

        for(int i = 1; i < n; i++){
            //answer *= ((long)Math.pow(m[i-1], m[i]) % 998244353);
            //answer = answer.multiply(BigDecimal.valueOf(Math.pow(m[i-1], m[i])));
            for(int j = 0; j < m[i]; j++){
                answer *= m[i-1] % 998244353;
            }
        }

        //System.out.println(answer % 998244353);
        //System.out.println(answer.remainder(BigDecimal.valueOf(998244353)).toBigInteger());
        System.out.println(answer);

    }

}
