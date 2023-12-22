import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    static int h, w;

    public static void main(String[] args) throws NumberFormatException, IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {

                int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

                h = arr[0];
                w = arr[1];

                if (h == 0 && w == 0) {
                    break;
                }

                System.out.println(getTopString(w, new StringBuilder()));//1行目
                IntStream.range(1, h - 1).forEach(i -> System.out.println(getLineString(w, new StringBuilder())));
                System.out.println(getTopString(w, new StringBuilder()));//最終行
                System.out.println();
            }
        }
    }

    public static String getLineString(int n, StringBuilder sb) {
        if(n == 1) {
            sb.append("#");
            return sb.toString();
        }else {
            if(sb.length() == 0) {
                sb.append("#");
            }else {
                sb.append(".");
            }
            return getLineString(n - 1, sb);
        }
    }

    public static String getTopString(int n, StringBuilder sb) {
        if(n == 0) {
            return sb.toString();
        }else {
            sb.append("#");
            return getTopString(n - 1, sb);
        }
    }
}

