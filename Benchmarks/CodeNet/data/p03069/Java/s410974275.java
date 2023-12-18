import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[] c = sc.next().toCharArray();

        sc.close();

        int cnt = 0;

        for (int i = 1; i < n; i++) {
            if (c[i] == '.' && c[i - 1] == '#') {
                if (i == 1) {
                    c[i - 1] = '.';
                } else if (i < n - 1 && c[i + 1] == '#') {
                    c[i] = '#';
                } else if (c[i - 2] == '.') {
                    c[i - 1] = '.';
                } else {
                    c[i] = '#';
                }
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}