import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();

    int[][] denkyu = new int[M][];
    for (int i = 0; i < M; i++) {
      int k = sc.nextInt();
      denkyu[i] = new int[k];
      for (int j = 0; j < k; j++) {
        denkyu[i][j] = sc.nextInt();
      }
    }
    
    int[] P = new int[M];
    for (int i = 0; i < M; i++) {
      P[i] = sc.nextInt();
    }

    int count = 0;
    int maxBit = 1 << N;
    for (int i = 0; i < maxBit; i++) {
      boolean allOn = true;
      for (int j = 0; j < M; j++) {
        allOn = allOn && isOn(denkyu[j], i, P[j]);
        if (!allOn) {
          break;
        }
      }
      if (allOn) {
        count++;
      }
    }
    
    //System.out.println(Arrays.deepToString(denkyu));
    //System.out.println(Arrays.toString(P));
    System.out.println(count);
  }
  
  private static boolean isOn(int[] switches, int bitPattern, int amari) {

    //System.out.println("### " + Arrays.toString(switches) + ", " + bitPattern + ", " + amari);
    
    int count = 0;
    for (int i = 0; i < switches.length; i++) {
      if (isOn(switches[i], bitPattern)) {
        count++;
      }
    }
    return count % 2 == amari;
  }
  
  private static boolean isOn(int switchNo, int bitPattern) {
    boolean ret = (bitPattern & (1 << (switchNo - 1))) == 1 << (switchNo - 1);
    //System.out.println("#### " + switchNo + ", " + bitPattern + ", ret: " + ret);
    return ret;
  }
}

