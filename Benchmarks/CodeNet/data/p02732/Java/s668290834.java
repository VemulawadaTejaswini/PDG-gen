import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] A = new String[N];
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            A[i] = sc.next();
            map.put(A[i],Objects.isNull(map.get(A[i])) ? 1 : map.get(A[i]) + 1);
        }
        int total = map.values().stream().mapToInt(Main::getTotal).sum();
        for (int i = 0; i < N; i++) {
            int n = map.get(A[i]);
            System.out.println(total - getTotal(n) + getTotal(n-1));
        }
    }
    static int getTotal(int n) {
        return n*(n-1)/2;
    }
}