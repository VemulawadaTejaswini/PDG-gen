import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        float a = sc.nextFloat();
        int[] places = new int[n];
        for (int i = 0; i < n; i++) places[i] = sc.nextInt();

        List<Float> temperatures = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            temperatures.add((float) (t - places[i] * 0.006));
        }

        float nearest = temperatures.stream().min((x, y) -> Float.compare(Math.abs(a - x), Math.abs(a - y))).get();
        System.out.println(temperatures.indexOf(nearest) + 1);
    }
}