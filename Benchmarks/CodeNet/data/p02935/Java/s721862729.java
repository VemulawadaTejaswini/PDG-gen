import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        LinkedList<Double> v = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            v.add(sc.nextDouble());
        }

        Collections.sort(v);

        while (v.size() >= 2) {
            double v1 = v.poll();
            double v2 = v.poll();
            v.offerFirst((v1 + v2) / 2);
        }

        System.out.print(v.get(0));
    }
}