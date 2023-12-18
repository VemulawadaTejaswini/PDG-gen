import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        int cnt = 1;
        for (int i = 0; i<N; i++) {
            int sc = scanner.nextInt();
            if (sc == cnt) {
                list.add(cnt++);
            }
        }

        int rst =  N - list.size();
        System.out.println(rst == N ? -1 : rst);
    }
}