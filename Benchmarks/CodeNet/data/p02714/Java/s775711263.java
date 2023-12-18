
import java.util.ArrayList;
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
        for (Integer a : RindexList) {
            for (Integer b : GindexList) {
                for (Integer c : BindexList) {
                    int[] array = new int[] {a, b, c};
                    if (check2(array[0] + 1, array[1] + 1, array[2] + 1)) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
    private static boolean check2(int i, int j, int k) {
        return j - i != k - j;
    }

}
