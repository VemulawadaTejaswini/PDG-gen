import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if (N <= 2) {
            System.out.println(-1);
        } else if (N % 2 == 0){
            int cur = 0;
            int i = 0;
            int j = 0;
            char[][] arr = new char[N][N];
            for (int ii = 0; ii < N; ++ii) {
                for (int jj = 0; jj < N; ++jj) {
                    arr[ii][jj] = '.';
                }
            }
            while (i < N) {
                arr[i][2*j] = arr[i][2*j + 1] = (char) ('a' + (j % 2));
                cur = (cur + 1) % 26;
                ++i;
                j = j + 1;
                if (2*j >= N) j = 0;
            }

            for (int ii = 0; ii < N; ++ii) {
                for (int jj = 0; jj < N; ++jj) {
                    System.out.print(arr[ii][jj]);
                } System.out.println();
            }
        } else {
            int i = 0;
            int j = 0;
            char[][] arr = new char[N][N];
            for (int ii = 0; ii < N; ++ii) {
                for (int jj = 0; jj < N; ++jj) {
                    arr[ii][jj] = '.';
                }
            }

            while (i < N) {
                if (j == N-1) {
                    arr[i][j] = arr[i + 1][j] = 'a';
                    i += 2;
                    j = 0;
                } else {
                    arr[i][j] = arr[i][j + 1] = 'a';
                    ++i;
                    j += 2;
                }  
            }

            for (int ii = 0; ii < N; ++ii) {
                for (int jj = 0; jj < N; ++jj) {
                    System.out.print(arr[ii][jj]);
                } System.out.println();
            }
        }
    }
}