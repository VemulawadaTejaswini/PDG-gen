import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int[] array = readIntArray(reader);
            int N = array[0];
            int K = array[1];

            int c = (N - 1) * (N - 2) / 2 - K;

            if (c < 0) {
                System.out.println("-1");
                return;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 2; i <= N; i++) {
                sb.append("1 ").append(i).append("\n");
            }

            for (int i = 2; i <= N; i++) {
                for (int j = i + 1; j <= N; j++) {
                    if (c == 0) {
                        break;
                    }

                    sb.append(i).append(" ").append(j).append("\n");
                    c--;
                }

                if (c == 0) {
                    break;
                }
            }

            System.out.println(N - 1 + (N - 1) * (N - 2) / 2 - K);
            System.out.print(sb.toString());
        }
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
