import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<Double> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(s.nextDouble());
        }
        Collections.sort(l);
        double ch = 0;
        if (n % 2 == 0) {
            for (int i = 0; i < (n / 2); i++) {
                ch = (l.get(i) + l.get(i + 1)) / 2;
                l.set(i, ch);
                l.set(i + 1, 0.0);
                ch = 0;
                Collections.sort(l);
            }
        } else {
            for (int i = 0; i < (n / 2 + 1); i++) {
                ch = (l.get(i) + l.get(i + 1)) / 2;
                l.set(i, ch);
                l.set(i + 1, 0.0);
                ch = 0;
                Collections.sort(l);
            }
        }
        System.out.print(l.get(n - 1));
    }
}