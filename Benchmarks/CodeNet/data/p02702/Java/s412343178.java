import java.util.HashSet;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pstr = sc.next();
        String str = pstr + "0";

        int len = str.length();
        char[] cha = str.toCharArray();
        HashSet<Long> hs = new HashSet<>();

        long num = 0;
        long[] rank = new long[len];

        for(int i=0; i<len; i++){
            String str_value = String.valueOf(cha[len-1-i]);
            int value = Integer.parseInt(str_value);
            if(i==0){
                rank[i] = 1;
            } else{
                rank[i] = (long)(10*rank[i-1])%2019;
            }
            num = (num + value*rank[i])%2019;
            hs.add(num);
        }

        int hslen = hs.size();

        System.out.println(len-hslen);
        sc.close();
    }
}