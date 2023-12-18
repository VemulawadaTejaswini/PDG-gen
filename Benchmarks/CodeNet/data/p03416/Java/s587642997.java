import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        int cnt = 0;
        for (int i = x; i <= y; i++) {
            String num = Integer.toString(i);
            boolean isKaibun = true;
            for (int j = 0; j < 2; j++) {
                if (num.charAt(j) != num.charAt(4 - j) ) {
                    isKaibun = false;
                }
            }
            if (isKaibun) cnt++;
        }
        System.out.println(cnt);
    }
}
