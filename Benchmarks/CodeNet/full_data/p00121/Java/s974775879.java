import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static void swap(int[] data, int i, int j) {
        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }

    static int toInt(int[] data) {
        int ret = 0;
        for (int i : data) {
            ret *= 10;
            ret += i;
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<Integer, Integer> dist = new HashMap<>();
        int[] firstPuzzle = new int[]{0, 1, 2, 3, 4, 5, 6, 7};

        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(firstPuzzle);
        dist.put(toInt(firstPuzzle), 0);

        while (!queue.isEmpty()) {
            int[] nowPuzzle = queue.poll();
            int nowDist = dist.get(toInt(nowPuzzle));

            int zPos = 0;
            for (int i = 0; i < 8; ++i) {
                if (nowPuzzle[i] == 0) zPos = i;
            }

            int[] directs = new int[3];
            directs[0] = (zPos == 3 || zPos == 7 ? zPos : zPos + 1);
            directs[1] = (zPos == 0 || zPos == 4 ? zPos : zPos - 1);
            directs[2] = (zPos < 4 ? zPos + 4 : zPos - 4);

            for (int j = 0; j < 3; ++j) {
                int[] nextPuzzle = nowPuzzle.clone();

                swap(nextPuzzle, zPos, directs[j]);
                int key = toInt(nextPuzzle);

                if (!dist.containsKey(key)) {
                    dist.put(key, nowDist + 1);
                    queue.add(nextPuzzle);
                }
                if (dist.containsKey(key) && dist.get(key) > nowDist + 1) {
                    dist.put(key, nowDist + 1);
                    queue.add(nextPuzzle);
                }
            }
        }

        while (scanner.hasNext()) {
            int[] puzzle = new int[8];

            for (int i = 0; i < 8; ++i) {
                puzzle[i] = scanner.nextInt();
            }
            System.out.println(dist.get(toInt(puzzle)));
        }
    }
}
