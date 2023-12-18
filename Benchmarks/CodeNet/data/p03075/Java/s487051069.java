import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    private static final int ANTENNA_COUNT = 5;

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int[] antennas = new int[ANTENNA_COUNT];
            for (int i = 0; i < ANTENNA_COUNT; ++i) {
                antennas[i] = Integer.parseInt(reader.readLine());
            }
            int maxDistance = Integer.parseInt(reader.readLine());
            test(antennas, maxDistance);
        }
    }

    public static void test(int[] antennas, int maxDistance) {
        int offset = 0;
        for (int a = 0; a < ANTENNA_COUNT; ++a) {
            ++offset;
            for (int b = offset; b < ANTENNA_COUNT; ++b) {
                int distance = antennas[b] - antennas[a];
                if (distance > maxDistance) {
                    System.out.println(":(");
                    return;
                }
            }
        }
        System.out.println("Yay!");
    }

}
