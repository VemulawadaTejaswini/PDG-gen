import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inStr = br.readLine().split(" ");
        int N = Integer.parseInt(inStr[0]);
        int M = Integer.parseInt(inStr[1]);
        int[][] arrSort = new int[M][3];
        int[][] arr = new int[M][3];
        for (int i = 0; i < M; i++) {
            inStr = br.readLine().split(" ");
            arrSort[i][0] = Integer.parseInt(inStr[0]);
            arrSort[i][1] = Integer.parseInt(inStr[1]);
            arrSort[i][2] = i;
        }
        sortArr(arrSort, new int[]{0, 1});
        int key = 0;
        int index = 0;
        for (int i = 0; i < M; i++) {
            if (key != arrSort[i][0]) {
                index = 1;
            } else {
                index++;
            }
            key = arrSort[i][0];
            arr[i][0] = key;
            arr[i][1] = index;
            arr[i][2] = arrSort[i][2];
        }
//        for (int i = 0; i < M; i++) {
//            System.out.println(arr[i][0] + " " + arr[i][1] + " " + arr[i][2]);
//        }
        sortArr(arr, new int[]{2});
//        for (int i = 0; i < M; i++) {
//            System.out.println(arr[i][0] + " " + arr[i][1] + " " + arr[i][2]);
//        }
        for (int i = 0; i < M; i++) {
            System.out.println(getId(arr[i][0]) + getId(arr[i][1]));
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

    public static void sortArr(int[][] arr, int[] sort) {
        Arrays.sort(arr, (first, second) -> {
            for (int i = 0; i < sort.length; i++) {
                int k = sort[i];
                if (first[k] > second[k]) {
                    return 1;
                } else if (first[k] < second[k]) {
                    return -1;
                } else {
                    continue;
                }
            }

            return 0;
        });
    }
}
