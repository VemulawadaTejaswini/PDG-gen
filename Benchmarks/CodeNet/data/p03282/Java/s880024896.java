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
            String s = br.readLine();
            long k = Long.parseLong(br.readLine());
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < s.length(); i++) {
                int tempNum = Integer.parseInt(s.substring(i, i + 1));
                list.add(tempNum);
            }
            int ans = 1;
            int tmpCount = 0;
            for (int i = 0; i < list.size(); i++) {
                int num = list.get(i);
                if (num == 1) {
                    continue;
                } if (num == 2) {
                    tmpCount++;
                    if (tmpCount > 1) {
                        ans = num;
                        break;
                    }
                } else {
                    ans = num;
                    break;
                }
            }
            System.out.println(ans);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
