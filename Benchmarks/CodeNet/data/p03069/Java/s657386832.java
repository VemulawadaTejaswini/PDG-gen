import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[] c = sc.next().toCharArray();

        sc.close();

        int cnt = 0;

        for (int i = 1; i < c.length; i++) {
            if (c[i] == '.' && c[i - 1] == '#') {
                cnt++;
            }
        }

        System.out.println(cnt);

    }

}