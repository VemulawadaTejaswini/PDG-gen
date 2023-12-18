import java.util.HashSet;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int len = str.length();
        char[] cha = str.toCharArray();
        HashSet<Long> hs = new HashSet<>();

        long num = 0;
        int len0 = hs.size();
        hs.add(num%2019);

        for(int i=len; i>0; i--){
            String str_value = String.valueOf(cha[i-1]);
            int value = Integer.parseInt(str_value);
            long rank = (long)Math.pow(10, len-i);
            num = num + value*rank;
            hs.add(num%2019);
            len0 = hs.size();
        }

        System.out.println(len+1-len0);
        sc.close();
    }
}