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

    private static int[][] deepCopy(int[][] arr) {
        int[][] res = new int[arr.length][];
        for (int i = 0; i < arr.length; ++i) {
            res[i] = arr[i].clone();
        }

        return res;
    }

    private static String asString(int[][] arr) {
        String str = new String();

        for (int i = 0; i < 2; ++i) {
            str += "" + arr[i][0] + arr[i][1] + arr[i][2] + arr[i][3];
        }

        return str;
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] A = inputIntArray(N);

        int counter = 0;
        for (int i = 0; i < N; ++i) {
            int minj = i;
            for (int j = i; j < N; ++j) {
                if (A[j] < A[minj])
                    minj = j;
            }
            if (i != minj) {
                A[i] = A[i] ^ A[minj];
                A[minj] = A[i] ^ A[minj];
                A[i] = A[i] ^ A[minj];
                ++counter;
            }
        }
        for (int i = 0; i < N; ++i) {
            System.out.print((i == 0 ? "" : " ") + A[i]);
        }
        System.out.println();
        System.out.println(counter);
    }

    /*
     * public static void main(String[] args) { scanner = new Scanner(System.in);
     * 
     * while (true) { int n, r;
     * 
     * n = scanner.nextInt(); r = scanner.nextInt();
     * 
     * int[] arr = new int[n];
     * 
     * for (int i = 0; i < n; ++i) { arr[i] = n - i; }
     * 
     * 
     * } }
     */
}

