import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    final int datasetCount = Integer.valueOf(input.readLine());
    while (input.ready()) {
      final String[] datasetStr = input.readLine().split(" ");
      float[] lineAB = new float[datasetStr.length / 2];
      float[] lineCD = new float[datasetStr.length / 2];
      for (int i = 0; i < 3; i++) {
        lineAB[i] = Float.parseFloat(datasetStr[i]);
      }
      for (int i = 0; i < 3; i++) {
        lineCD[i] = Float.parseFloat(datasetStr[i + 4]);
      }

      System.out.println(isParallelStr(lineAB, lineCD));
    }
  }

  private static String isParallelStr(float[] lineAB, float[] lineCD) {
    if (isParallel(lineAB, lineCD)) {
      return "YES";
    }
    return "NO";
  }

  private static boolean isParallel(float[] lineAB, float[] lineCD) {
    return getSlope(lineAB[0], lineAB[1], lineAB[2], lineAB[3]) == getSlope(lineCD[0], lineCD[1], lineCD[2], lineCD[3]);
  }

  private static float getSlope(float x1, float y1, float x2, float y2) {
    final float diff_X =Math.max(x1, x2) - Math.min(x1, x2);
    final float diff_Y=Math.max(y1, y2) - Math.min(y1, y2);
    return diff_Y / diff_X;
  }
}