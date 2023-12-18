import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inStr = br.readLine().split(" ");
        int N = Integer.parseInt(inStr[0]);
        int M = Integer.parseInt(inStr[1]);
        int n = 100000;
        String[] arrSort = new String[M];
        int[][] arr = new int[M][2];
        for (int i = 0; i < M; i++) {
            inStr = br.readLine().split(" ");
            arrSort[i] = (n + Integer.parseInt(inStr[0])) + "" + (n + Integer.parseInt(inStr[1]));
            arr[i][0] = Integer.parseInt(inStr[0]);
            arr[i][1] = Integer.parseInt(inStr[1]);
        }
        Arrays.sort(arrSort);
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < M; i++) {
            int key = Integer.parseInt(arrSort[i].substring(0, 6)) - n;
            int value = Integer.parseInt(arrSort[i].substring(6, 12)) - n;
            if (map.containsKey(key)) {
                map.get(key).add(value);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(value);
                map.put(key, list);
            }
        }
        for (int i = 0; i < M; i++) {
            System.out.println(String.format("%06d", (arr[i][0])) + String.format("%06d", (map.get(arr[i][0]).indexOf(arr[i][1]) + 1)));
        }
    }

    private static String getId(int num) {
        String str = String.valueOf(num);
        String pNum = "";
        if (str.length() < 6) {
            for (int i = 0; i < 6 - str.length(); i++) {
                pNum += "0";
            }
            pNum += str;
        } else {
            pNum = str;
        }
        return pNum;
    }
}
