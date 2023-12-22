import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      final var hw = Arrays.stream(br.readLine().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();
      final var walls = new int[hw[0]][2];
      for (int i = 0; i < walls.length; i++) {
        final var l = Arrays.stream(br.readLine().split(" "))
          .mapToInt(Integer::parseInt)
          .toArray();
        walls[i][0] = l[0] - 1;
        walls[i][1] = l[1] - 1;
      }

      var prev = new int[hw[1]];
      for (int i = 0; i < prev.length; i++) {
        prev[i] = i + 1;
      }

      var minIdx = 0;
      for (int j = 1; j < hw[0] + 1; j++) {
        var prevMinIdx = minIdx;
        final var current = new int[hw[1]];
        var minIdxSet = false;
        for (int i = minIdx; i < current.length; i++) {
          if (i >= walls[j - 1][0] && i <= walls[j - 1][1]) {
            if (i > 0 && current[i - 1] > 0) {
              current[i] = current[i - 1] + 1;
              if (!minIdxSet) {
                minIdxSet = true;
                minIdx = i;
              }
            } else {
              // noop
            }
          } else if (prev[i] == 0) {
            if (i > 0 && current[i - 1] > 0) {
              current[i] = current[i - 1] + 1;
              if (!minIdxSet) {
                minIdxSet = true;
                minIdx = i;
              }
            } else {
              // noop
            }
          } else {
            if (i > 0 && current[i - 1] > 0) {
              current[i] = Math.min(current[i - 1] + 1, prev[i] + 1);
            } else {
              current[i] = prev[i] + 1;
            }
            if (!minIdxSet) {
              minIdxSet = true;
              minIdx = i;
            }
          }
        }
        System.out.println(current[minIdx] - 1);
        prev = current;
      }
    }
  }
}
