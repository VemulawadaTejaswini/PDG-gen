import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int N = sc.nextInt(), M = sc.nextInt();
        int[] L = new int[M], R = new int[M], D = new int[M];
        Set<Integer> H = new HashSet<>();
        for (int i = 0; i < M; i++) {
            L[i] = sc.nextInt();
            R[i] = sc.nextInt();
            D[i] = sc.nextInt();
            H.add(L[i]);
            H.add(R[i]);
        }

        Map<Integer, Integer> P = new HashMap<>(); //key-> H, val-> pos

        for (Integer human : H) { // base human
            for (int i = 0; i < M; i++) {
                if (P.isEmpty()) {
                    P.put(L[i], 0);
                }
                if (P.get(human) != null) {
                    if (human.equals(L[i])) {
                        if (P.get(R[i]) != null && P.get(R[i]) != P.get(human) + D[i]) {
                            System.out.println("No");
                            return;
                        } else {
                            P.put(R[i], P.get(human) + D[i]);
                        }
                    } else if (human.equals(R[i])) {
                        if (P.get(L[i]) != null && P.get(L[i]) != P.get(human) - D[i]) {
                            System.out.println("No");
                            return;
                        } else {
                            P.put(L[i], P.get(human) - D[i]);
                        }
                    }
                }
            }
        }
        System.out.println("Yes");
    }
}
