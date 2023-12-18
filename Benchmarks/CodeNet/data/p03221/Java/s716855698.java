import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inStr = br.readLine().split(" ");
        int N = Integer.parseInt(inStr[0]);
        int M = Integer.parseInt(inStr[1]);
        int[][] arrSort = new int[M][2];
        int[][] arr;
        for (int i = 0; i < M; i++) {
            inStr = br.readLine().split(" ");
            arrSort[i][0] = Integer.parseInt(inStr[0]);
            arrSort[i][1] = Integer.parseInt(inStr[1]);
        }
        arr = arrSort.clone();
        sortArr(arrSort);
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < M; i++) {
            int key = arrSort[i][0];
            int value = arrSort[i][1];
            if (map.containsKey(key)) {
                map.get(key).add(value);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(value);
                map.put(key, list);
            }
        }
        for (int i = 0; i < M; i++) {
            System.out.println(getId(arr[i][0]) + getId(map.get(arr[i][0]).indexOf(arr[i][1]) + 1));
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

    public static void sortArr(int[][] arr) {
        Arrays.sort(arr, (first, second) -> {
            if (first[1] > second[1]) {
                return 1;
            } else if (first[1] < second[1]) {
                return -1;
            }
            return 0;
        });
    }
}
