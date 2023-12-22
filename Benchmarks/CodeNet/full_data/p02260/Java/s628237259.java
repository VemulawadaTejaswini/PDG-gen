import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int N = readInt(r);
        String[] numStrings = r.readLine().split(" ");
        int[] A = new int[N];
        for (int i = 0;i < N;i++) {
            A[i] = Integer.parseInt(numStrings[i]);
        }
//        insertionSort(A, N);
//        bubbleSort(A, N);
        selectionSort(A, N);
    }
    
    public static void insertionSort(int[] A, int N) {
        System.out.println(dump(A, N));
        for (int i = 1;i <= (N - 1);i++) {
            int v = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > v) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = v;
            System.out.println(dump(A, N));
        }
    }
    
    public static void bubbleSort(int[] A, int N) {
        int swapCount = 0;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int j = N - 1;j >= 1;j--) {
                if (A[j] < A[j - 1]) {
                    swapInt(A, j, j - 1);
                    swapCount++;
                    flag = true;
                }
            }
        }
        System.out.println(dump(A, N));
        System.out.println(swapCount);
    }
    
    public static void selectionSort(int[] A, int N) {
        int swapCount = 0;
        for (int i = 0;i < N;i++) {
            int minj = i;
            for (int j = i;j < N;j++) {
                if (A[j] < A[minj]) {
                    minj = j;
                }
            }
            if (A[i] != A[minj]) {
                swapInt(A, i, minj);
                swapCount++;
            }
        }
        System.out.println(dump(A, N));
        System.out.println(swapCount);
    }
    
    public static void swapInt(int[] A, int j, int k) {
        int v = A[j];
        A[j] = A[k];
        A[k] = v;
    }
    
    public static String dump(int[] A, int N) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0;i < N;i++) {
            if (i != 0) {
                builder.append(" ");
            }
            builder.append(A[i]);
        }
        return builder.toString();
    }
    
    public static int readInt(BufferedReader r) throws Exception {
        return Integer.parseInt(r.readLine());
    }
}