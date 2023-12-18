
import javax.swing.*;
import java.io.*;
import java.util.*;

public class Main {

    static class Point {
        int i;
        int j;

        public Point(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String first = rd.readLine();
        String second = rd.readLine();
        int[][] arr = new int[first.length()][second.length()];
        Point[][] arr2 = new Point[first.length()][second.length()];
        if (first.charAt(0) == second.charAt(0)) {
            arr[0][0] = 1;
        } else {
            arr[0][0] = 0;
        }
        arr2[0][0] = new Point(0,0);
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                int prev = 0;
                if(i > 0) {
                    prev = arr[i - 1][j];
                }
                int prev2 = 0;
                if(j > 0) {
                    prev2 = arr[i][j- 1];
                }
                int curValue = 0;
                if (first.charAt(i) == second.charAt(j)) {
                    if (i > 0 && j > 0) {
                        arr[i][j] = arr[i - 1][j - 1] + 1;
                        arr2[i][j] = new Point(i-1,j - 1);
                    } else {
                        arr[i][j] = 1;
                        if (i == 0) {
                            arr2[i][j] = new Point(0, j -1);
                        } else {
                            arr2[i][j] = new Point(i - 1, 0);
                        }
                    }
                } else {
                    arr[i][j] = Integer.max(prev, prev2);
                    if (arr[i][j] == prev) {
                        arr2[i][j] = new Point(i-1,j);
                    } else if (arr[i][j] == prev2) {
                        arr2[i][j] = new Point(i,j - 1);
                    }
                }
            }
        }

        StringBuilder s = new StringBuilder();
        int lastI = arr.length - 1;
        int lastJ = arr[0].length - 1;
        while (true) {
            if (first.charAt(lastI) == second.charAt(lastJ)) {
                s.append(first.charAt(lastI));
            }
           Point p = arr2[lastI][lastJ];
            if (p.i == -1 || p.j == -1) {
                break;
            }
           lastI = p.i;
           lastJ = p.j;
           if (lastI == 0 && lastJ == 0) {
               if (first.charAt(lastI) == second.charAt(lastJ)) {
                   s.append(first.charAt(lastI));
               }
               break;
           }
        }
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        wr.append(s.reverse());
        wr.flush();
    }

}