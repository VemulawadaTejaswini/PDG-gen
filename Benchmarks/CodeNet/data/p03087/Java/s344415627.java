import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();

        String[] str = new String[q];
        String[] tmp = new String[q];

        for (int i = 0; i < q; i++) {
            int l = sc.nextInt() - 1;
            int r = sc.nextInt();
            str[i] = s.substring(l, r);
            tmp[i] = str[i].replaceAll("AC", "");

        }
        sc.close();

        for (int i = 0; i < q; i++) {
            System.out.println((str[i].length() - tmp[i].length()) / 2);
        }
    }
}