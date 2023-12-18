
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author yoshizaki
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int people = scanner.nextInt();
        scanner.nextLine();
        int[] position = null;
        for(int i = 0; i == people -1; i++) {
            position[i] = scanner.nextInt();
        }
        long venue = Math.round(Double.valueOf(IntStream.of(position).average().toString()));
        long stamina = 0;
        for(long i: position) {
            stamina = stamina + (i-venue)*(i-venue);
        }
        System.out.println(stamina);
    }
}
