import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int radius = scanner.nextInt();
        int attack = scanner.nextInt();
        List<Integer> coordinates = new ArrayList<>(n);
        List<Integer> hps = new ArrayList<>(n);
        List<Integer> neighbour = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int hp = scanner.nextInt();
            hp = divideCeil(hp, attack);
            coordinates.add(x);
            hps.add(hp);
        }
        for (int i = 0; i < n; i++) {
            int coordinate = coordinates.get(i);
            int nei = i;
            long range_inclusive = 2L * radius + coordinate;
            for (; nei < n; nei++) {
                int temp_coordinate = coordinates.get(nei);
                if (temp_coordinate > range_inclusive)
                    break;
            }
            neighbour.add(nei);
        }

        int[] damages = new int[n];
        long total = 0;
        for (int i = 0; i < n; i++) {
            int current_hp = hps.get(i) - damages[i];
            if (current_hp < 0)
                continue;
            total += current_hp;
            for (int j = i; j < neighbour.get(i); j++) {
                damages[j] += current_hp;
            }
        }
        System.out.println(total);
    }

    static int divideCeil(int numerator, int denominator) {
        double a = numerator;
        double b = denominator;
        return (int) Math.ceil(a / b);
    }
}