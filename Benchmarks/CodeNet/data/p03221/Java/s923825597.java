import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inStr = br.readLine().split(" ");
        int N = Integer.parseInt(inStr[0]);
        int M = Integer.parseInt(inStr[1]);
        int[][] arr = new int[M][2];
        for (int i = 0; i < M; i++) {
            inStr = br.readLine().split(" ");
            for (int j = 0; j < 2; j++) {
                arr[i][j] = Integer.parseInt(inStr[j]);
            }
        }
        Map<Integer, int[]> map = new HashMap<>();
        int[] listSort;
        for (int i = 0; i < M && !map.containsKey(arr[i][0]); i++) {
            listSort = new int[M];
            listSort[0] = arr[i][1];
            for (int j = i + 1; j < M; j++) {
                if (arr[i][0] == arr[j][0]) {
                    listSort[j] = arr[j][1];
                }
            }
            Arrays.sort(listSort);
            map.put(arr[i][0], getNoZeroArr(listSort));
        }
        for (int i = 0; i < M; i++) {
            System.out.println(getId(arr[i][0]) + getId(Arrays.binarySearch(map.get(arr[i][0]), arr[i][1]) + 1));
        }
    }

    private static int[] getNoZeroArr(int[] arr) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                cnt++;
            }
        }
        int[] newArr = new int[cnt];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                newArr[j] = arr[i];
                j++;
            }
        }
        return newArr;
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
