import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        TreeMap<Integer, ArrayList<Integer>> m = new TreeMap<>();
        for (int i = 0; i < N; ++i) A[i] = sc.nextInt();
        int dup = 0;
        int currentKey = A[0];
        for (int i = 0; i < N; ++i) {
            if (currentKey < A[i]) {
                ArrayList<Integer> current = m.get(currentKey);
                m.remove(currentKey);
                current.add(A[i]);
                m.put(A[i], current);
                currentKey = A[i];
            } else {
                Integer lower = m.lowerKey(A[i]);
                if (lower == null) {
                    if (m.containsKey(A[i])) ++dup;
                    ArrayList<Integer> a = new ArrayList<>();
                    a.add(A[i]);
                    m.put(A[i], a);
                } else {
                    ArrayList<Integer> current = m.get(lower);
                    m.remove(lower);
                    current.add(A[i]);
                    m.put(A[i], current);
                }
                currentKey = A[i];
            }
        }
        System.out.println(m.size() + dup);
    }
}
