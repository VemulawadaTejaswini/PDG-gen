import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int N = readInt(reader);
            int[] A = readIntArray(reader);
            int[] B = readIntArray(reader);
            int[] C = readIntArray(reader);

            int manzoku = 0;
            for (int i = 0; i < N; i++) {
                manzoku += B[A[i] - 1];

                if (i >= 1 && A[i] == A[i - 1] + 1) {
                    manzoku += C[A[i - 1] - 1];
                }
            }

            System.out.println(manzoku);
        }
    }

    public static int readInt(BufferedReader reader) throws Exception {
        return Integer.parseInt(reader.readLine());
    }

    public static int[] readIntArray(BufferedReader reader) throws Exception {
        String[] str = reader.readLine().split(" ");
        int[] array = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            array[i] = Integer.parseInt(str[i]);
        }
        return array;
    }

}
