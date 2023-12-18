import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //nという変数を作り、標準入力から数字を一つ読み取って、nに入れる
        int q = sc.nextInt();

        String s = sc.next();

        int[] l = new int[q];
        int[] r = new int[q];
        for (int i = 0; i < q; i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }

        for (int i = 0; i < q; i++) {
            String truncatedStr = s.substring(l[i] - 1, r[i]);
            Pattern pattern = Pattern.compile("AC");
            Matcher matcher = pattern.matcher(truncatedStr);

            int count = 0;
            while(matcher.find())
                count ++;

            System.out.println(count);
        }
    }
}
