import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static List<String> switchState = new ArrayList<String>();
    private static List<List<Integer>> switchStateList = new ArrayList<List<Integer>>();
    private static String str;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        Integer[][] arr = new Integer[N][2];
        for (int i = 0; i < N; i++) {
            arr[i][0] = 0;
            arr[i][1] = 1;
        }
        makeSwitchState(0, arr, "");

        for (String strState : switchState) {
            String[] splitState = strState.split(",");
            List<Integer> list = new ArrayList<Integer>();
            for (String s : splitState) {
                list.add(Integer.valueOf(s));
            }
            switchStateList.add(list);
        }

        Map<Integer, Integer> switchCountMap = new HashMap<Integer, Integer>();
        List<List<Integer>> switchConnectList = new ArrayList<List<Integer>>();
        for (int i = 0; i < M; i++) {
            int k = sc.nextInt();
            List<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j < k; j++) {
                int s = sc.nextInt();
                list.add(s);
            }
            switchConnectList.add(list);
        }

        List<Integer> pList = new ArrayList<Integer>();
        for (int i = 0; i < M; i++) {
            int p = sc.nextInt();
            pList.add(p);
            //            System.out.println(p);
        }

        int ans = 0;
        for (List<Integer> state : switchStateList) {
            int cnt = 0;
            for (int i = 0; i < M; i++) {
                List<Integer> switches = switchConnectList.get(i);
                int on = 0;
                for (Integer sw : switches) {
                    if (state.get(sw - 1) == 1) {
                        on++;
                    }
                }
                if (on % 2 == pList.get(i)) {
                    cnt++;
                } else {
                    break;
                }
            }
            if (cnt == M) {
                ans++;
            }
        }

        System.out.println(ans);

    }

    static void makeSwitchState(int i, Integer[][] arr, String output) {
        if (i == arr.length) {
            switchState.add(output);
            return;
        }

        String delim = (output.length() > 0) ? "," : "";
        for (int j = 0; j < arr[i].length; j++) {
            makeSwitchState(i + 1, arr, output + delim + arr[i][j]);
        }
    }
}
