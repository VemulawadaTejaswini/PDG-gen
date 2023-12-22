import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static HashMap<Integer, Integer> fibs = new HashMap<>();

    public static void main(String[] args) {
        fibs.put(0, 1);
        fibs.put(1, 1);
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(fibonacci(n));
        in.close();
    }

    private static int fibonacci(int n) {
        if (!fibs.containsKey(n)) {
            fibs.put(n, fibonacci(n-1) + fibonacci(n-2));
        }
        return fibs.get(n);
    }
}

