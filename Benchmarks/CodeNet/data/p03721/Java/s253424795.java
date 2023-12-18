import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String strArr[] = br.readLine().split(" ");
            int n = Integer.parseInt(strArr[0]);
            int k = Integer.parseInt(strArr[1]);
            ArrayList<Integer> ans = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                strArr = br.readLine().split(" ");
                int num = Integer.parseInt(strArr[0]);
                int count = Integer.parseInt(strArr[1]);
                for (int j = 0; j < count; j++) {
                    ans.add(num);
                }
            }
            Collections.sort(ans);
            Collections.reverse(ans);
            System.out.println(ans.get(k));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}