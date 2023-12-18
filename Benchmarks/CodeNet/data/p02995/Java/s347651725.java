
import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {
    public static Long gcd(Long a, Long b) {
        if (a < b) return gcd(b, a);
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static Long lcm(Long a, Long b) {
        if (a < b) return lcm(b, a);
        return a * b / gcd(a, b);
    }

    public static Long cal(Long a, Long b) {
        Long min_f;
        if(a%b == 0) {
            min_f = a / b;
            min_f *=b;
        } else {
            min_f= (a / b) + 1;
            min_f*=b;
        }
        return min_f;

    }
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Long a = scanner.nextLong();
        Long b = scanner.nextLong();
        Long c = scanner.nextLong();
        Long d = scanner.nextLong();


        Long min_f_abc = cal(a,c);

        Long min_m_abc = b / c;
        min_m_abc*=c;

        Long total_abc = ((min_m_abc - min_f_abc) / c) + 1;

        Long min_f_abd = cal(a,d);
        Long min_m_abd = b / d;
        min_m_abd*=d;

        Long total_abd = ((min_m_abd - min_f_abd) / d) + 1;

        Long lcm = lcm(c,d);

        Long lcm_f_abd = cal(a,lcm);
        Long lcm_m_abd = b/lcm;
        lcm_m_abd*=b;

        Long lcm_abd = ((lcm_m_abd - lcm_f_abd) / lcm) + 1;

        Long t = (b-a+1) - (total_abc + total_abd - lcm_abd);
        System.out.println(t);

    }
}
