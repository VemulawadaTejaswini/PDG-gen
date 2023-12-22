import static java.lang.Math.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double[]> l = new ArrayList<>();
        while (sc.hasNext()) {
            Double[] p = Stream.of(sc.next().split(",")).map(Double::parseDouble).toArray(Double[]::new);
            l.add(p);
        }
        double area = 0;
        for (int i = 0; i < l.size() - 2; i++) {
            double a = sqrt(pow(l.get(i + 1)[0] - l.get(i)[0], 2) + pow(l.get(i + 1)[1] - l.get(i)[1], 2));
            double b = sqrt(pow(l.get(l.size() - 1)[0] - l.get(i + 1)[0], 2) + pow(l.get(l.size() - 1)[1] - l.get(i + 1)[1], 2));
            double c = sqrt(pow(l.get(i)[0] - l.get(l.size() - 1)[0], 2) + pow(l.get(i)[1] - l.get(l.size() - 1)[1], 2));
            double z = (a + b + c) / 2;
            area += sqrt(z * (z - a) * (z - b) * (z - c));
        }
        System.out.println(area);
    }
}
