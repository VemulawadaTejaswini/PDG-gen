import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static PrintWriter out;

    public static void main(String[] args) {
        Main.run();
    }

    private static void run() {
        out = new PrintWriter(new BufferedOutputStream(System.out));
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int answer = 1;
        for (int i = 1, count = 0, maxcount = 0; i <= n; i++) {
            // iを2で割れる回数
            count = Main.countOfDividedByTwo(i);
            // 最高記録を上回る場合
            if (maxcount < count) {
                answer = i;
                maxcount = count;
            }
        }
        out.println(answer);
        out.close();
        sc.close();
    }

    private static int countOfDividedByTwo(int pnum) {
        int count = 0;
        int n = pnum;
        while (n % 2 == 0) {
            n = n / 2;
            count++;
        }
        return count;
    }

}
