import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt();
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(i, sc.nextInt());
        }

        for (int i = 0; i < n; i++) {
            LinkedHashMap<Integer, Integer> tmp = new LinkedHashMap<>(map);
            tmp.remove(i);

            Object[] o = tmp.values().toArray();
            Arrays.sort(o);
            System.out.println(o[(o.length + 1) / 2 - 1]);
        }
    }
}
