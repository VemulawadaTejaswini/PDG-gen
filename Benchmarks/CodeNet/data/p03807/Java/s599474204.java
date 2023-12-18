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
            String aStr[] = br.readLine().split(" ");
            ArrayList<Integer> aList = new ArrayList<Integer>();
            for (int i = 0; i < aStr.length; i++) {
                aList.add(Integer.parseInt(aStr[i]));
            }
            boolean noFlag = false;
            while (aList.size() > 1) {
                if (aList.size() == 2) {
                    int tmp1 = aList.get(0);
                    int tmp2 = aList.get(1);
                    if (tmp1 % 2 == 0 && tmp2 % 2 == 0) {
                        int sum = tmp1 + tmp2;
                        aList.remove(1);
                        aList.remove(0);
                        aList.add(sum);
                    } else if (tmp1 % 2 != 0 && tmp2 % 2 != 0) {
                        int sum = tmp1 + tmp2;
                        aList.remove(1);
                        aList.remove(0);
                        aList.add(sum);
                    } else {
                        System.out.println("NO");
                        noFlag = true;
                        break;
                    }
                } else {
                    int tmp1 = aList.get(0);
                    int tmp2 = aList.get(1);
                    int tmp3 = aList.get(2);
                    if ((tmp1 % 2 == 0 && tmp2 % 2 == 0) || (tmp1 % 2 != 0 && tmp2 % 2 != 0)) {
                        int sum = tmp1 + tmp2;
                        aList.remove(1);
                        aList.remove(0);
                        aList.add(sum);
                    } else if ((tmp1 % 2 == 0 && tmp3 % 2 == 0) || (tmp1 % 2 != 0 && tmp3 % 2 != 0)) {
                        int sum = tmp1 + tmp3;
                        aList.remove(2);
                        aList.remove(0);
                        aList.add(sum);
                    } else if ((tmp2 % 2 == 0 && tmp3 % 2 == 0) || (tmp2 % 2 != 0 && tmp3 % 2 != 0)) {
                        int sum = tmp2 + tmp3;
                        aList.remove(2);
                        aList.remove(1);
                        aList.add(sum);
                    }
                }
            }
            if (!noFlag) {
                System.out.println("YES");
            }
           } catch (IOException e) {
            e.printStackTrace();
        }
    }
}