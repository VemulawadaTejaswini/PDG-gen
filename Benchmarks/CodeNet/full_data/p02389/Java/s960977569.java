import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int[] a_b = Stream.of(sc.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .mapToInt(Integer::intValue)
                    .toArray();
            if (a_b.length != 2) {
                System.out.println("Numbers of args not match.");
            }
            System.out.println(a_b[0] * a_b[1]);
        } catch (NoSuchElementException | NumberFormatException e) {
            System.out.println(e);
        }
    }
}

