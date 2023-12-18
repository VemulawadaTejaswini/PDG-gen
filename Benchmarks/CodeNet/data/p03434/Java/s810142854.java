

import java.util.*;

public class Main {
    public static void run(List<Integer> As) {
        Collections.sort(As, Collections.reverseOrder());

        int as = 0, bs = 0;
        boolean isA = true;
        for (int a : As) {
            if (isA) {
                as += a;
            } else {
                bs += a;
            }
            isA = !isA;
        }

        System.out.println(as - bs);
    }

    public static void runInput() {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        List<Integer> As = new ArrayList<>(N);
        for (int i = 0; i < N; i++ ) {
            As.add(scanner.nextInt());
        }
        run(As);
    }

    public static void main(String args[]) {
        runInput();
        //run(Arrays.asList(2, 7, 4));
        //run(Arrays.asList(20, 18, 2, 18));
    }
}
