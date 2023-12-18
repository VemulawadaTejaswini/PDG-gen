

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int[] arr = inputval();
        int N, A, B;
        N = arr[0];
        A = arr[1];
        B = arr[2];
        int m,n;
        int sum_digits;
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            m = i;
            n = i;
            sum_digits = 0;
            while (n > 0) {
                sum_digits += n % 10;
                n /= 10;
            }
            if (A <= sum_digits && sum_digits <=B){
                sum += m;
            }
        }
        System.out.println(sum);
    }


    static int[] inputval() throws Exception {
        String[] strarray = br.readLine().trim().split(" ");
        int[] intarray = new int[strarray.length];
        for (int i = 0; i < intarray.length; i++) {
            intarray[i] = Integer.parseInt(strarray[i]);
        }
        return intarray;
    }

    static void array_sout(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void array_sout(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}