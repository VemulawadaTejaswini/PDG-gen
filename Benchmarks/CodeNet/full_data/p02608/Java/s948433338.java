import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int f;
        int num = readInt(new StringBuilder());
        int[] arr = new int[num];
        Arrays.fill(arr, 0);
        for (int x = 1; x < 100; x++) {
            for (int y = 1; y < 100; y++) {
                for (int z = 1; z < 100; z++) {
                    f = x * x + y * y + z * z + x * y + y * z + z * x;
                    if (f > num) {
                        break;
                    }

                    arr[f - 1] = arr[f - 1] + 1;
                }
            }
        }

        for (int i = 0; i < num; i++) {
            System.out.println(arr[i]);
        }
    }

    private static int readInt(StringBuilder builder) {
        builder.setLength(0);
        while (true) {
            try {
                int b = System.in.read();
                if (b == ' ' || b == '\n' || b == -1) {
                    break;
                } else {
                    builder.appendCodePoint(b);
                }
            } catch (IOException e) {
                break;
            }
        }

        return Integer.parseInt(builder.toString());
    }

}
