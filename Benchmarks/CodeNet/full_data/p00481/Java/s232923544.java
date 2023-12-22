// AOJ 0558

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt(), W = sc.nextInt(), N = sc.nextInt();
        char[][] town = new char[H][];
        for (int i = 0; i < H; i++) {
            town[i] = sc.next().toCharArray();
        }
        boolean[][] visited = new boolean[H][W];
        ArrayDeque<int[]> queue = new ArrayDeque<int[]>();
        int stamina = 1;
        int[][] move = new int[][] {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (town[i][j] == 'S') {
                    queue.add(new int[] {i, j, 0});
                    visited[i][j] = true;
                }
            }
        }

        while (true) {
            int[] data = queue.poll();
            int i = data[0], j = data[1], time = data[2];
            for (int[] m: move) {
                int ni = i + m[0], nj = j + m[1];
                if (ni < 0 || H <= ni || nj < 0 || W <= nj || visited[ni][nj]) continue;
                if (town[ni][nj] == stamina + '0') {
                    stamina++;
                    if (stamina == N + 1) {
                        System.out.println(time + 1);
                        return;
                    }
                    queue.clear();
                    queue.add(new int[] {ni, nj, time+1});
                    visited = new boolean[H][W];
                    break;
                } else if (town[ni][nj] == 'X') {
                    continue;
                } else {
                    queue.add(new int[] {ni, nj, time+1});
                    visited[ni][nj] = true;
                }
            }
        }
    }
}

