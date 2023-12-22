import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] elements = br.readLine().split(" ");
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(elements[i]);
        }

        int key;
        int i, j, k;
        String output;
        printArray(A, N);
        for (i = 1; i < N; i++) {
            key = A[i];
            j = i - 1;
            while (j >= 0 && A[j] > key) {
                A[j+1] = A[j];
                j--;
            }
            A[j+1] = key;

            printArray(A, N);
        }
    }

    public static void printArray (int[] array, int length) {
        String output = "";
        for (int i = 0; i < length; i++) {
            output += array[i];
            if (i != length-1) {
                output += " ";
            }
        }
        System.out.println(output);
    }
}