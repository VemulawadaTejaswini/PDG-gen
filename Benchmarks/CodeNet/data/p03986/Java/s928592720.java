import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        final String check_str = "ST";
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        int s_cnt = s.length();
        while (s_cnt >= 4) {
            s_cnt /= 2;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s_cnt; i++) {
                sb.append("S");
            }
            for (int i = 0; i < s_cnt; i++) {
                sb.append("T");
            }
            s = s.replaceAll(sb.toString(), "");
        }
        while (true) {
            s = s.replaceAll(check_str, "");
            if (s.indexOf(check_str, 0) == -1)
                break;
        }
        System.out.println(s.length());
    }
}
