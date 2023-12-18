import javax.swing.*;
import java.io.*;
import java.sql.Struct;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String first = rd.readLine();
        String second = rd.readLine();
        int[][] arr = new int[first.length()][second.length()];
        int[][] arr2 = new int[first.length()][second.length()];
        int[][] arr3 = new int[first.length()][second.length()];

        if (first.charAt(0) == second.charAt(0)) {
            arr[0][0] = 1;
        }
        arr2[0][0] = -1;
        arr3[0][0] = -1;
        
        for (int i = 0; i < arr.length; i++) {
        	if (first.charAt(i) == second.charAt(0)) arr[i][0] = 1;
        	arr2[i][0] = -1;
        	arr3[i][0] = -1;
        }
        for (int i = 0; i < arr[0].length; i++) {
        	if (first.charAt(0) == second.charAt(i)) arr[0][i] = 1;
        	arr2[0][i] = -1;
        	arr3[0][i] = -1;
        }

        for(int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
                int prev = arr[i - 1][j];
                int prev2 = arr[i][j - 1];
                if (first.charAt(i) == second.charAt(j)) {
                   arr[i][j] = arr[i - 1][j - 1] + 1;
                   arr2[i][j] = i - 1;
                   arr3[i][j] = j - 1;
                } else {
                    if (prev >= prev2) {
                    	arr[i][j] = prev;
                    	arr2[i][j] = i - 1;
                    	arr3[i][j] = j;
                    } else {
                    	arr[i][j] = prev2;
                    	arr2[i][j] = i;
                    	arr3[i][j] = j - 1;
                    }
                }
            }
        }

        StringBuilder s = new StringBuilder();
        int lastI = arr.length - 1;
        int lastJ = arr[0].length - 1;
        while (true) {
            if (lastI == -1 || lastJ == -1) {
                break;
            }
            if (first.charAt(lastI) == second.charAt(lastJ)) {
                s.append(first.charAt(lastI));
            }

            int tmp = lastI;
            lastI = arr2[lastI][lastJ];
            lastJ = arr3[tmp][lastJ];
        }
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        wr.append(s.reverse());
        wr.flush();
    }

}
