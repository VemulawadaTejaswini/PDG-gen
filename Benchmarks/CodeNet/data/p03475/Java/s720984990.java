
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int N = Integer.parseInt(br.readLine().trim());
        int[][] CSF = new int[N - 1][3];
        for (int i = 0; i < N - 1; i++) {
            CSF[i] = inputval();
        }
        int time;

        for (int i = 0; i < N - 1; i++) {
            time = 0;
            for (int j = i; j < N - 1; j++) {
                if (time % CSF[j][2] == 0) {
                    time = Math.max(CSF[j][1], time) + CSF[j][0];
                } else {
                    time = Math.max(CSF[j][1], time + CSF[j][2] - time % CSF[j][2]) + CSF[j][0];
                }
            }
            System.out.println(time);
        }
        System.out.println(0);
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