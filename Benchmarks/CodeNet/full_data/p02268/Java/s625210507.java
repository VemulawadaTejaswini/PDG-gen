import java.util.*;

public class Main {
    private static Scanner scanner;

    public static int[] inputIntArray(int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; ++i) {
            res[i] = scanner.nextInt();
        }

        return res;
    }

    // public static String[] <T> ToStringArray(T[] arr) {
    // String[] res = new String[arr.length];
    // for(int i = 0; i < arr.length; ++i) {
    // res[i] = String.valueOf(arr[i]);
    // }

    // return res;
    // }

    private static List<Integer> asIntergerList(int[] arr) {
        List<Integer> intList = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            intList.add(arr[i]);
        }

        return intList;
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] S = inputIntArray(n);

        int q = scanner.nextInt();
        int[] T = inputIntArray(q);

        int cnt = 0;
        for (int i = 0; i < q; ++i) {
            int res = Arrays.binarySearch(S, T[i]);

            if (res > 0 && S[res] == T[i])
                ++cnt;
        }

        System.out.println(cnt);

    }
}

