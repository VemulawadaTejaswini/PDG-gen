import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> d = new ArrayList<>();
        ArrayList<Integer> t = new ArrayList<>();

        int N = Integer.parseInt(scanner.next());
        for (int i = 0; i < N; i++) {
            d.add(Integer.parseInt(scanner.next()));
        }
        int M = Integer.parseInt(scanner.next());
        if (M > N) {
            System.out.println("NO");
            return;
        }
        for (int i = 0; i < M; i++) {
            t.add(Integer.parseInt(scanner.next()));
        }

        for (int i = 0; i < M; i++) {
            int tmp = t.get(i);
            if (d.contains(tmp)) {
                d.remove(d.indexOf(tmp));
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}