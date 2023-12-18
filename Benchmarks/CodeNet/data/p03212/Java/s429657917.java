import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        System.out.println(check("0", n));
    }

    static int check(String s, long i) {
        int cnt = 0;
        if (Long.parseLong(s) > i)
            return 0;

        if (s.contains("7") && s.contains("5") && s.contains("3"))
            cnt++;
        cnt += check(s + "7", i);
        cnt += check(s + "5", i);
        cnt += check(s + "3", i);
        return cnt;
    }
}
