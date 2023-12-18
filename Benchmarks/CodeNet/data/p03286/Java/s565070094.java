import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;

public class Main {

    static boolean succeeded;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean[] k = new boolean[33];
        for (int i = 0;i <= 32;++i){
            if((n - 1) % -2 == 0){
                k[32 - i] = true;
                --n;
            }
            n /= -2;
        }
        boolean flag = false;
        StringBuilder sb = new StringBuilder();
        for (boolean b:k){
            if(b){
                sb.append('1');
                flag = true;
            }
            else if(flag)sb.append('0');
        }
        if(sb.length() == 0){
            sb.append('0');
        }
        System.out.println(sb.toString());
    }






























}
