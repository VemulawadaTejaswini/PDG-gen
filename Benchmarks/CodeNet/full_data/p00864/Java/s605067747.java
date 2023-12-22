import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, w, v, val, h;
        double ink;
        while (true) {
            h = 0;
            ink = 0.01;
            n = sc.nextInt();
            w = sc.nextInt();
            if (n == 0) break;

            List<Integer> histogram = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                v = sc.nextInt();

                if (v/w > histogram.size()-1) {
                    // extend size of histogram
                    while (v/w > histogram.size()-1)
                        histogram.add(0);
                }
                val = histogram.get(v/w) + 1;
                if (val > h) h = val;
                histogram.set(v/w, val); // increment
            }
            double brightness = histogram.size()-1;

            for (int i = 0; i < histogram.size(); i++) {
                ink += (histogram.get(i) / (double)h) * ((brightness-i)/brightness);
            }
            System.out.println(ink);
        }
    }
}