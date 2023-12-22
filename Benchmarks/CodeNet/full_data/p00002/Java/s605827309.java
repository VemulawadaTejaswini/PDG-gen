import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String... args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int[] i0 = new int[200];
        int[] i1 = new int[200];
        try {
            for (int i = 0; i < 200; i++) {
                String[] data = input.readLine().split(" ");
                i0[i] = Integer.parseInt(data[0]);
                i1[i] = Integer.parseInt(data[1]);
            }
        } catch (IOException e) {
        }
        for (int i = 0; i < 200; i++)
            System.out.println(i0[i] + i1[i]);
    }
}