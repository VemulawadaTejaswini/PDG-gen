import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static ArrayList<Integer> primeList;

    public static void main(String[] args) throws IOException {
        while (true) {
            int[] t = ai();
            int[] list = new int[25 * 60];
            if (t[0] == 0 && t[1] == 0 && t[2] == 0) {
                break;
            }
            int n = t[0];
            int start = toMinutes(t[1]);
            int finish = toMinutes(t[2]);
            for (int i = 0; i < n; i++) {
                int m = ip();
                int[] ct = ai();
                for (int j = 0; j < m * 2; j += 2) {
                    int ts = toMinutes(ct[j]);
                    int tf = toMinutes(ct[j + 1]);
                    list[ts]++;
                    list[tf]--;
                }
            }
            for (int i = 1; i < 25 * 60; i++) {
                list[i] += list[i - 1];
            //    System.out.println(list[i]);
            }
            int max = 0;
            for (int i = start; i < finish; i++) {
                if (list[i] == n) {
                    list[i] = 0;
                } else {
                    list[i] = list[i > 0 ? i - 1 : 0] + 1;
                }
                max = Math.max(max, list[i]);
            }
            System.out.println(max);
        }
    }

    static int[] ai() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");
        int n = lines.length;
        int[] list = new int[n];
        while (n-- > 0) {
            list[n] = Integer.parseInt(lines[n]);
        }
        return list;
    }

    static int ip() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(br.readLine());
    }

    static int toMinutes(int t) {
        return t / 100 * 60 + t % 100;
    }

}