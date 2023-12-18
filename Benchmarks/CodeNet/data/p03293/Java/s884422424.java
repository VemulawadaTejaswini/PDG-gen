import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();

        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            if (flag)
                break;
            char cs = s.charAt(i);
            char ct = t.charAt(0);

            if (cs != ct)
                continue;

            int cnt = i + 1;
            for (int j = 1; j < t.length(); j++) {
                cs = s.charAt(cnt++);
                ct = t.charAt(j);
                if (cs != ct) {
                    flag = false;
                    break;
                }
                if (cnt >= s.length())
                    cnt = 0;
                flag = true;
            }
        }

        System.out.println(flag ? "Yes" : "No");
    }
}
