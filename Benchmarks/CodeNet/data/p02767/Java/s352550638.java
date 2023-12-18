import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String n = scanner.nextLine();
        String x = scanner.nextLine();
        String[] coordinates = x.split(" ");
        int[] numbers = new int[coordinates.length];

        int min = Integer.parseInt(coordinates[0]);
        int max = Integer.parseInt(coordinates[0]);
        for (int i = 0; i < coordinates.length; i++) {
            numbers[i] = Integer.parseInt(coordinates[i]);
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        int minStamina = 1000000;
        for (int i = min; i <= max; i++) {
            int stamina = 0;
            for (int j: numbers) {
                stamina += Math.pow((j-i), 2);
            }
            if (stamina < minStamina) {
                minStamina = stamina;
            }
        }
        System.out.println(minStamina);

    }

}
