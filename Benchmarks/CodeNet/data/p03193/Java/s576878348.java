import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int N = Integer.parseInt(st.nextToken());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());

            int amount = 0;
            for (int I = 0; I < N; I++) {
                st = new StringTokenizer(in.readLine());
                int l = Integer.parseInt(st.nextToken());
                int w = Integer.parseInt(st.nextToken());
                if (l >= H && w >= W) {
                    amount++;
                }
            }
            System.out.println(amount);
        } catch (IOException ex) {

        }
    }
}
