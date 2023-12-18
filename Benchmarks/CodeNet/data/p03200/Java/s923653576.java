import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] s = sc.next().toCharArray();

        int cnt = 0;
        for (int i = s.length-1; i > 0; i--) {
            if (s[i] == 'W') {
                if (s[i-1] == 'B') {
                    s[i] = 'B';
                    s[i-1] = 'W';
                    cnt++;

                    if (i < s.length-3)
                        i+=3;
                }
            }
        }

        System.out.println(cnt);
    }
}
