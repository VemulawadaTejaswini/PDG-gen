import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int total1 = inp.nextInt();

        int[] list1 = new int[total1];

        for(int i = 0; i < total1; i++){
            list1[i] = inp.nextInt();
        }

        Arrays.sort(list1);

        int total2 = inp.nextInt();

        int[] list2 = new int[total2];

        for(int i = 0; i < total2; i++) {
            list2[i] = inp.nextInt();
        }

        Arrays.sort(list2);

        ArrayList<Integer> sameList = new ArrayList<>();

        for (int i : list1) {
            int tempNum;

            String tempString = binarySearch(list2, list2.length, i);

            if (tempString != null) {
                tempNum = Integer.parseInt(tempString);

                if (!(sameList.contains(tempNum))) {
                    sameList.add(tempNum);
                }
            }
        }

        System.out.println(sameList.size());
    }

    public static String binarySearch(int[] list, int n, int t) {
        int l = 0;
        int r = n-1;

        while (l <= r) {
            int mid = (int) Math.floor((l + r) / 2);

            if (list[mid] < t) {
                l = mid + 1;
            } else if (list[mid] > t) {
                r = mid - 1;
            } else if (list[mid] == t) {
                return list[mid] + "";
            }
        }

        return null;
    }
}

