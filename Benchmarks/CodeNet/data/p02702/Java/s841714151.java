import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] c = sc.next().toCharArray();
        int n = c.length;
        int[] r = new int[n];
        int base = 1;
        r[n-1] = c[n-1] - '0';
        int mod = 2019;
        int[] rm = new int[mod];
        rm[0] = 1;
        rm[r[n-1]] = 1;
        for(int i=n-2; i>=0; i--) {
            base *= 10;
            base %= 2019;
            int num = c[i]-'0';
            r[i] = (r[i+1] + num * base) % mod;
            rm[r[i]]++;
        }

        long res = 0;
        for(int i=0; i<mod; i++) {
            res += (long)rm[i] * (rm[i]-1) / 2;
        }

        System.out.println(res);


    }



}