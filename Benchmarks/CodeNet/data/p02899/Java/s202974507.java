import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int N = readInt(reader);
            int[] A = readIntArray(reader);

            int[] order = new int[N];
            for (int i = 0; i < N; i++) {
                order[A[i] - 1] = i + 1;
            }

            StringBuilder sb = new StringBuilder();
            sb.append(order[0]);
            for (int i = 1; i < N; i++) {
                sb.append(" ").append(order[i]);
            }
            System.out.println(sb.toString());
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
