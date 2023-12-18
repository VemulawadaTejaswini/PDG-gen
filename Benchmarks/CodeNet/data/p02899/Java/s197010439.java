import org.w3c.dom.ls.LSOutput;

import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int n = sc.nextInt();
        Map<Integer, Integer> a = new HashMap<>();
        for (int i = 0; i < n; i++) {
            a.put(i, sc.nextInt());
        }
        a.entrySet().stream().sorted(
            Map.Entry.comparingByValue()).forEach(
            entry ->  {
                System.out.print(entry.getKey()+1+" ");
            }
        );
    }
}

