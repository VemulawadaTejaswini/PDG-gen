import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mountains = Integer.parseInt(sc.next());
        int[] damRain = new int[mountains];
        int totalRain = 0;
        for (int i = 0; i < mountains; i++) {
            damRain[i] = Integer.parseInt(sc.next());
            totalRain += damRain[i];
        }

        Function<int[], Integer> getEvenRain = damRainArr -> {
            int evenRain = 0;
            for (int i = 1; i < mountains; i += 2) {
                evenRain += damRainArr[i];
            }
            return evenRain;
        };

        int[] mountainRain = new int[mountains];

        mountainRain[0] = totalRain - (2 * getEvenRain.apply(damRain));
        
        for (int i = 1; i < mountains; i++) {
            mountainRain[i] = (2 * damRain[i - 1]) - mountainRain[i - 1];
        }

        for (Integer rain : mountainRain) {
            System.out.print(rain.toString() + " ");
        }
    }
}