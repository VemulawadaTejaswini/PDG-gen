import java.io.*;
import java.util.Arrays;

public class Main {
  public static final int MAX_W = 100000 * 10000;

  public static void main(String args[]) {
    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      String[] inputs = in.readLine().split(" ");
      int n = Integer.parseInt(inputs[0]);
      int k = Integer.parseInt(inputs[1]);
      int[] loads = new int[n];
      for(int i=0; i<n; i++) {
        loads[i] = Integer.parseInt(in.readLine());
      }
      int left = 0;
      int right = MAX_W;
      int middle = 0;
      while(right > left + 1){
        middle = (left + right) / 2;
        if(getMaxLoadCount(middle, k, loads) >= n) {
          right = middle;
        } else {
          left = middle;
        }
      }
      System.out.println(right);
    } catch(IOException e) {
    }
  }

  public static int getMaxLoadCount(int maxLoadSize, int truckCount, int[] loads) {
    int j = 0;
    int[] trucks = new int[truckCount];
    Arrays.fill(trucks, maxLoadSize);
    for(int k=0; k<truckCount; k++) {
      while(trucks[k] - loads[j] >= 0) {
        trucks[k] = trucks[k] - loads[j];
        j++;
        if(j == loads.length) {
          return j;
        }
      }
    }
    return j;
  }
}