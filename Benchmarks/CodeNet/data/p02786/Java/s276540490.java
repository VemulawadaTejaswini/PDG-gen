import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.setIn(Main.class.getResourceAsStream("input"));
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        long h = sc.nextLong();
        long monsters = 1;
        long attacks = 0;
        while(h > 0) {
            attacks += monsters;
            monsters <<= 1;
            h >>= 1;
        }
        System.out.println(attacks);
    }

    private static int nextInt(Scanner sc) {
        return Integer.valueOf(sc.nextLine());
    }

    private static int[] toArray(String text) {
        return Arrays.stream(text.split("\\s")).mapToInt(Integer::valueOf).toArray();
    }

}