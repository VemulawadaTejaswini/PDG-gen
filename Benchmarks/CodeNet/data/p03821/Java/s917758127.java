import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            int n = Integer.parseInt(br.readLine());
            ArrayList<Integer> a = new ArrayList<Integer>();
            ArrayList<Integer> b = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                String tmp[] = br.readLine().split(" ");
                a.add(Integer.parseInt(tmp[0]));
                b.add(Integer.parseInt(tmp[1]));
            }
            int count = 0;
            for (int i = n; i > 0; i--) {
                int atmp = a.get(i - 1);
                atmp = atmp + count;
                int btmp = b.get(i - 1);
                if (btmp != 1) {
                    count = count + getCount(atmp, btmp);
                }
            }
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int getCount(int a, int b) {
        int result = 0;
        if (a < b) {
            result = b - a;
        } else if (a > b) {
            int tmp = a / b;
            b = b * (tmp + 1);
            result = b - a;
        }
        return result;
    }
}