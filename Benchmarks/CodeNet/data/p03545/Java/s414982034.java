import java.util.*;
import java.text.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    DecimalFormat df = new DecimalFormat("000");

    int[] ret = new int[3];

    char[] arr;

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        arr = sc.next().toCharArray();

//        System.out.println(arr[0]);

        int cnt = (int)Math.pow(2, 3);

        String[] s = new String[cnt];
        for (int i=0; i<cnt; i++) {
            s[i] = String.format("%3s", Integer.toBinaryString(i)).replace(" ", "0");
        }

//        System.out.println(s[5]);

        dfs("");

        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]);

        for (int i=0; i<3; i++) {

            sb.append(ret[i] == '0' ? "+" : "-");
            sb.append(arr[i+1]);
        }
        sb.append("=");
        sb.append("7");
        System.out.println(sb.toString());

    }

    void dfs(String s) {
        if (s.length() == 3) {
            int sum = arr[0] - '0';
            for (int i=0; i<s.length(); i++) {
                if (s.charAt(i) == '0') {
                    sum += (arr[i+1] - '0');
                } else {
                    sum -= (arr[i+1] - '0');
                }
            }
//            System.out.println(sum);
//            System.out.println(s);
            if (sum == 7) {
//                System.out.println("yes");
                for (int i=0; i<3; i++) {
                    ret[i] = s.charAt(i);
                }
            }
        } else {
            for (int i=0; i<2; i++) {
                dfs(s + String.valueOf(i));
            }
        }

    }


}
