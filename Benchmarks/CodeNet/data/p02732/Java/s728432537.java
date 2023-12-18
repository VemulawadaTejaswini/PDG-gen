import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] A = new String[N];
        Map<String, Integer> a = new HashMap<>();
        for (int i = 0; i < N; i++) {
            A[i] = sc.next();
            a.put(A[i],Objects.isNull(a.get(A[i])) ? 1 : a.get(A[i]) + 1);
        }
        int total = a.values().stream().mapToInt(e -> (e * (e - 1) / 2)).sum();
        for (int i = 0; i < N; i++) {
            int n = a.get(A[i]);
            int b = n*(n-1)/2;
            int c = (n-1)*(n-2)/2;
            System.out.println(total - b + c);
        }
    }
}