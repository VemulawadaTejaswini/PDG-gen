import java.util.*;
import static java.lang.Math.min;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int count = 0;
        for(int i = 0; i < S.length(); i++) {

            for(int j = i; j <= S.length(); j++) {
                String a = S.substring(i, j);
    
                if (!a.equals("0") && Long.parseLong(a) % 2019 == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
