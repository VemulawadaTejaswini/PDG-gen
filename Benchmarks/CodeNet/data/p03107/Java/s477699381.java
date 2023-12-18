import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String[] s = sc.next().split("");
        sc.close();

        Arrays.sort(s);

        String str = String.join("", s);

        int cnt = 0;

        for (int i = 0; i < 10000; i++) {
            int idx = str.indexOf("01");
            if (idx != -1) {
                cnt++;
                str = str.replace("01", "");
            }
        }

        System.out.println(cnt * 2);

    }
}
