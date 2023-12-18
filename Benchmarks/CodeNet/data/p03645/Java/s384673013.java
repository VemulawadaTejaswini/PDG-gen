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
            String strArr[] = br.readLine().split(" ");
            int n = Integer.parseInt(strArr[0]);
            int m = Integer.parseInt(strArr[1]);
            ArrayList<Integer> list1 = new ArrayList<Integer>();
            ArrayList<Integer> list2 = new ArrayList<Integer>();
            for (int i = 0; i < m; i++) {
                strArr = br.readLine().split(" ");
                int tmp1 = Integer.parseInt(strArr[0]);
                int tmp2 = Integer.parseInt(strArr[1]);
                if (tmp1 == 1) {
                    list1.add(tmp2);
                }
                if (tmp2 == n) {
                    list2.add(tmp1);
                }
            }
            boolean flag = false;
            for (int i = 0; i < list1.size(); i++) {
                int tmp = list1.get(i);
                for (int j = 0; j < list2.size(); j++) {
                    if (tmp == list2.get(j)) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    break;
                }
            }
            if (flag) {
                System.out.println("POSSIBLE");
            } else {
                System.out.println("IMPOSSIBLE");
            }
        } catch (IOException e) {
            e.printStackTrace();
           }
    }

}
