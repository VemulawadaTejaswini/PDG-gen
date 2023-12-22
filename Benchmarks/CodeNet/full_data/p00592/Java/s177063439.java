import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static ArrayList<Integer> primeList;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int[] t = ai(br);
            int[] list = new int[25 * 60];
            if (t[0] == 0 && t[1] == 0 && t[2] == 0) {
                break;
            }
            int n = t[0];
            int start = toMinutes(t[1]);
            int finish = toMinutes(t[2]);
            for (int i = 0; i < n; i++) {
                int m = ip(br);
                int[] ct = ai(br);
                for (int j = 0; j < m * 2; j += 2) {
                    int ts = toMinutes(ct[j]);
                    int tf = toMinutes(ct[j + 1]);
                    list[ts]++;
                    list[tf]--;
                }
            }
            for (int i = start; i < finish; i++) {
                list[i] += list[i - 1];
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

    private static int[] ai(BufferedReader br) throws IOException {
        String[] lines;

        lines = br.readLine().split(" ");
        int a = lines.length;
        int[] l = new int[a];
        while (a-- > 0) {
            l[a] = Integer.parseInt(lines[a]);
        }
        return l;
    }

    static int ip(BufferedReader br) throws IOException {
        return Integer.parseInt(br.readLine());
    }

    static int toMinutes(int t) {
        return t / 100 * 60 + t % 100;
    }

}
/*
1 2100 2400
1
2130 2200
3 2100 2400
3
2100 2130 2200 2230 2300 2330
2
2130 2200 2330 2400
2
2100 2130 2330 2400
0 0 0
*/