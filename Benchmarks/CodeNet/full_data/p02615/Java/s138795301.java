import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    void solve(Scanner sc, PrintWriter pw) {
        int N = sc.nextInt();
        List<Integer> data = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            data.add(sc.nextInt());
        }
        data.sort(Collections.reverseOrder());
        long result = 0;
        for (int i = 1; i < N; i++) {
            result += data.get(i / 2);
        }
        pw.println(result);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        new Main().solve(sc, pw);
        pw.flush();
        pw.close();
        sc.close();
    }
}
