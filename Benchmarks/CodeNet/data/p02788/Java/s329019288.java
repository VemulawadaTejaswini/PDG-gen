import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class Main {
    public static void main(String[] args) {
        int n = 0;
        int radius = 0;
        List<Integer> coordinates = null;
        List<Integer> hps = null;
        List<Integer> neighbour = null;
        try (InputStreamReader isr = new InputStreamReader(System.in); BufferedReader br = new BufferedReader(isr);) {
            String line;
            String[] arrayString;
            line = br.readLine();
            arrayString = line.split(" ");
            n = Integer.parseInt(arrayString[0]);
            radius = Integer.parseInt(arrayString[1]);
            int attack = Integer.parseInt(arrayString[2]);
            coordinates = new ArrayList<>(n);
            hps = new ArrayList<>(n);
            neighbour = new ArrayList<>(n);
            Map<Integer, Integer> monsters = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                line = br.readLine();
                arrayString = line.split(" ");
                int x = Integer.parseInt(arrayString[0]);
                int hp = Integer.parseInt(arrayString[1]);
                hp = divideCeil(hp, attack);
                monsters.put(x,hp);
            }
            for (int x : monsters.keySet()) {
                int hp = monsters.get(x);
                coordinates.add(x);
                hps.add(hp);
            }
        } catch (IOException e) {

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