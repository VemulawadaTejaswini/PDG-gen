import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long num = 0;
        int cnt = 1;
        long[] array26 = new long[10000000];
        while (num < N){
            num = num + (long) Math.pow(26, cnt);
            array26[cnt] = num;
            cnt++;
        }

        long digit_num = 0;
        digit_num = N - array26[cnt - 2] - 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cnt - 1; i++){
            sb.append(String.valueOf((char) (digit_num % 26 + 97)));
            digit_num = digit_num / 26;
        }
        StringBuffer reverseString = new StringBuffer(sb.toString());
        System.out.println(reverseString.reverse().toString());
    }
}