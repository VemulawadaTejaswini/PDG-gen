import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long[] gojou = new long[101];
        for (long i = 1; i <= 100; i++) {
            gojou[(int) i] = i * i * i * i * i;
        }
        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                if (gojou[i] - gojou[j] == x) {
                    StringJoiner sj = new StringJoiner(" ");
                    sj.add(String.valueOf(i));
                    sj.add(String.valueOf(j));
                    System.out.println(sj);
                    return;
                }
                if (gojou[i] + gojou[j] == x) {
                    StringJoiner sj = new StringJoiner(" ");
                    sj.add(String.valueOf(i));
                    sj.add(String.valueOf(j * -1));
                    System.out.println(sj);
                    return;
                }
                if (-gojou[i] + gojou[j] == x) {
                    StringJoiner sj = new StringJoiner(" ");
                    sj.add(String.valueOf(i * -1));
                    sj.add(String.valueOf(j * -1));
                    System.out.println(sj);
                    return;
                }
            }
        }
    }

}
