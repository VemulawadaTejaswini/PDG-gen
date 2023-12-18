import java.util.*;

public class Main {

    private static class AB {
        int A;
        int B;
        AB(int A, int B) {
            this.A = A;
            this.B = B;
        }
    }

    private static int N;
    private static AB[] AB;

    public static void main(String[] args) {
        load();
        solve();
    }

    private static void load() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        AB = new AB[N];
        for (int i = 0; i < N; i += 1) {
            AB[i] = new AB(Integer.parseInt(sc.next()), Integer.parseInt(sc.next()));
        }
    }

    private static void solve() {
        Arrays.sort(AB, new Comparator<Main.AB>() {
            @Override
            public int compare(Main.AB o1, Main.AB o2) {
                return Integer.compare(o1.B, o2.B);
            }
        });

        int time = 0;
        for (AB ab : AB) {
            time += ab.A;
            if (time > ab.B) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

}
