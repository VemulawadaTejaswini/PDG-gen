import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        StringJoiner sj = new StringJoiner(" ");
        sj.add("0");
        sj.add("0");
        sj.add("0");
        long rem = 1;
        if (n <= 1_000_000_000) {
            rem = n;
        } else {
            rem = n % 1_000_000_000;
        }
        sj.add(String.valueOf(rem));
        sj.add(String.valueOf(n / rem));
        sj.add("0");
        System.out.println(sj);
    }

}
