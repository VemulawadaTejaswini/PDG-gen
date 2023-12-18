import java.util.Arrays;
import java.util.Scanner;

/**
 * Created on 2016/08/13.
 */
public class Main {
    private static final int NUM = 30;
    private static int[][] matrix;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        matrix = new int[str.length()][NUM];
        for (int i=0; i<str.length(); i++) {
            matrix[i] = new int[NUM];
            Arrays.fill(matrix[i], 0);
        }


        int cnt = 0;
        for (char c : str.toCharArray()) {
            int idx = (int) c - (int) 'a';
            if (cnt == 0) {
                matrix[cnt][idx]++;
            } else {
                for (int t = 0; t < NUM; t++) {
                    int tmp = matrix[cnt-1][t];
                    matrix[cnt][t] = tmp;
                }
                matrix[cnt][idx]++;
            }
            cnt++;
        }

//        for(int j=0; j<NUM; j++){
//            for(int i=0; i<str.length(); i++){
//                System.out.print(matrix[i][j] + "\t");
//            }
//            System.out.println("");
//        }


        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i+1; j < str.length(); j++) {
                if (compare(i, j)) {
                    System.out.println((i + 1) + " " + (j + 1));
                    return;
                }
            }
        }
        System.out.println(-1 + " " + -1);
    }

    private static boolean compare(int i, int j) {
        int diff = j - i;
        int judge = (j-i) / 2;

        if(diff % 2 == 0){
            judge++;
        }else{
            judge += 2;
        }


        int[] compareVect;
        if (i == 0) {
            compareVect = new int[NUM];
            Arrays.fill(compareVect, 0);
        } else {
            compareVect = matrix[i - 1];
        }

        boolean found = compareVector(compareVect, matrix[j], judge);

        if (found) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean compareVector(int[] vect1, int[] vect2, int judge) {
        int max = 0;
        // TODO remove
        int tmp =0;


        for (int i = 0; i < NUM; i++) {
            int diff = vect2[i] - vect1[i];
            if(diff > max){
                max = diff;
                tmp = i;
            }
        }

        if (max >= judge) {
//            System.out.println("cnt:" + max);
//            System.out.println("judge:" + judge);
//            System.out.println((char)(tmp + (int)'a'));
//            for(int i=0; i < vect1.length; i++){
//                System.out.print(vect1[i] + "\t");
//            }
//            System.out.println();
//
//            for(int i=0; i < vect2.length; i++){
//                System.out.print(vect2[i] + "\t");
//            }
//            System.out.println();
            return true;
        } else {
            return false;
        }
    }
}
