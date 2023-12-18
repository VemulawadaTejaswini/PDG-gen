import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inStr = br.readLine().split(" ");
        int N = Integer.parseInt(inStr[0]);
        int M = Integer.parseInt(inStr[1]);
        int[][] arrSort = new int[M][2];
        for (int i = 0; i < M; i++) {
            inStr = br.readLine().split(" ");
            for (int j = 0; j < 2; j++) {
                arrSort[i][j] = Integer.parseInt(inStr[j]);
            }
        }
        int[][] arr = arrSort.clone();
        sortArr(arrSort);

        for (int i = 0; i < M; i++) {
            int num = 0;
            for (int j = 0, k = 0; j < M; j++) {
                if (arr[i][0] == arrSort[j][0]) {
                    if (arr[i][1] == arrSort[j][1]) {
                        num = k;
                        break;
                    }
                    k++;
                }
            }
            System.out.println(getId(arr[i][0]) + getId(num + 1));
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
        Arrays.sort(arr, (Comparator<int[]>) (first, second) -> {
            if (first[1] > second[1]) {
                return 1;
            } else if (first[1] < second[1]) {
                return -1;
            }
            return 0;
        });
    }
}
