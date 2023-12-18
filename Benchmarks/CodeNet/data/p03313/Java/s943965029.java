import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by darshan on 5/29/19.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int size = 1 << n;
        st = new StringTokenizer(br.readLine());
        int[][] maxPair = new int[size][2];
        for (int i = 0; i < size; i++) {
            maxPair[i][0] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            int twoPowerI = 1 << i;
            for (int j = 0; j < size; j++) {
                if ((j & twoPowerI) != twoPowerI) {
                    merge(maxPair[j], maxPair[j | twoPowerI]);
                }
            }
        }

        int max = 0;
        for (int i = 1; i < size; i++) {
            max = Math.max(max, maxPair[i][0] + maxPair[i][1]);
            out.println(max);
        }
        out.close();
    }

    private static void merge(int[] from, int[] to) {
        int[] temp = new int[4];
        temp[0] = from[0];
        temp[1] = from[1];
        temp[2] = to[0];
        temp[3] = to[1];
        Arrays.sort(temp);
        to[0] = temp[3];
        to[1] = temp[2];
    }
}
