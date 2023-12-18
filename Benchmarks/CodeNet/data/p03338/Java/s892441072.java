import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            int max = 0;
            for (int i = 1; i < n; i++) {
                String a = str.substring(0, i);
                String b = str.substring(i, n);
                int count = strCount(a, b);
                if (count > max) {
                    max = count;
                }
            }
            System.out.println(max);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int strCount(String a, String b) {
        int ret = 0;
        int arr1[] = new int[26];
        int arr2[] = new int[26];
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            int index = (int)ch - 97;
            arr1[index]++;
        }
        for (int i = 0; i < b.length(); i++) {
            char ch = b.charAt(i);
            int index = (int)ch - 97;
            arr2[index]++;
        }
        for (int i = 0; i < 26; i++) {
            if (arr1[i] > 0 && arr2[i] > 0) {
                ret++;
            }
        }
        return ret;
    }
}
