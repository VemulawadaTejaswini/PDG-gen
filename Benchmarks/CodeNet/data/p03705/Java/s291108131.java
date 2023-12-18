

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

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

    public static void main(String[] args) throws Exception {

            int[] val = inputval();
            int N,A,B;
            N = val[0];
            A = val[1];
            B = val[2];
            int result;
            if(A > B) result = 0;
            else if(N == 1){
                result = 1;
            } else {
                result = (B-A) * (N - 2) + 1 ;
            }
            System.out.println(result);
    }

}