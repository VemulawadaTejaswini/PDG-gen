import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int[] x1_y1_x2_y2 = Stream.of(sc.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int x = x1_y1_x2_y2[2] - x1_y1_x2_y2[0];
            int y = x1_y1_x2_y2[3] - x1_y1_x2_y2[1];
            int z2 = x * x + y * y;
            double z = Math.pow((double)z2, 0.5);
            System.out.println(z);
        } catch (NoSuchElementException
                | NumberFormatException e) {
            System.out.println(e);
        }
    }
}

