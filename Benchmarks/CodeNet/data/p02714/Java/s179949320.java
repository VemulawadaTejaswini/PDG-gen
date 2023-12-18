
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        char[] S = scanner.next().toCharArray();
        List<Integer> RindexList = new ArrayList<>();
        List<Integer> GindexList = new ArrayList<>();
        List<Integer> BindexList = new ArrayList<>();
        for (int i=0; i<N; i++) {
            if (S[i] == 'R') RindexList.add(i);
            if (S[i] == 'G') GindexList.add(i);
            if (S[i] == 'B') BindexList.add(i);
        }

        int count = 0;

        count += count(RindexList, GindexList, BindexList);
        count += count(RindexList, BindexList, GindexList);
        count += count(GindexList, RindexList, BindexList);
        count += count(GindexList, BindexList, RindexList);
        count += count(BindexList, GindexList, RindexList);
        count += count(BindexList, RindexList, GindexList);
        System.out.println(count);
    }

    private static int count(List<Integer> aList, List<Integer> bList, List<Integer> cList) {
        int count = 0;
        for (Integer a : aList) {
            for (Integer b : bList) {
                if (a > b) continue;
                for (Integer c : cList) {
                    if (a > c || b > c) continue;
                    int[] array = new int[] {a, b, c};
                    if (check2(array[0] + 1, array[1] + 1, array[2] + 1)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
    private static boolean check2(int i, int j, int k) {
        return j - i != k - j;
    }

}
