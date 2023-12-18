import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            int n = Integer.parseInt(br.readLine());
            String aStr[] = br.readLine().split(" ");
            List<String> strList = new ArrayList<String>(Arrays.asList(aStr));
            while (true) {
                ArrayList<Integer> k = new ArrayList<Integer>();
                ArrayList<Integer> g = new ArrayList<Integer>();
                boolean flag = false;;
                for (int i = 0; i < n; i++) {
                    int tmp = Integer.parseInt(strList.get(i));
                    if (tmp % 2 == 0) {
                        g.add(i);
                        if (g.size() >= 2) {
                            int index1 = g.get(0);
                            int tmp1 = Integer.parseInt(strList.get(index1));
                            int index2 = g.get(1);
                            int tmp2 = Integer.parseInt(strList.get(index2));
                            strList.remove(index2);
                            strList.remove(index1);
                            int sum = tmp1 + tmp2;
                            strList.add(String.valueOf(sum));
                            n = strList.size();
                            flag = true;
                            break;
                        }
                    } else {
                        k.add(i);
                        if (k.size() >= 2) {
                            int index1 = k.get(0);
                            int tmp1 = Integer.parseInt(strList.get(index1));
                            int index2 = k.get(1);
                            int tmp2 = Integer.parseInt(strList.get(index2));
                            strList.remove(index2);
                            strList.remove(index1);
                            int sum = tmp1 + tmp2;
                            strList.add(String.valueOf(sum));
                            n = strList.size();
                            flag = true;
                            break;
                        }
                    }
                }
                if (!flag) {
                    if (strList.size() == 1) {
                        System.out.println("YES");
                    } else if (strList.size() == 2) {
                        System.out.println("NO");
                    }
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}