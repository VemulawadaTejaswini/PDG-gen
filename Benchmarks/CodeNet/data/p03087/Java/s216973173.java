import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();

        for (int i = 0; i < q; i++) {
            int l = sc.nextInt() - 1;
            int r = sc.nextInt();
            String str = s.substring(l, r);
            int cnt = countStr(str, "AC");
            System.out.println(cnt);

        }
        sc.close();

    }

    static int countStr(String str, String regex) {
        int len = regex.length();
        int count = 0;
        int s = 0;
        while (str.indexOf(regex, s) != -1) {
            s = str.indexOf(regex, s) + len;
            count++;
        }
        return count;
    }
}