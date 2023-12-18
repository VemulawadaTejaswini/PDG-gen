import java.io.*;
import java.util.*;
public class Main {
  public static void main(String[] args) throws Exception {
    String line = null;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    line = br.readLine();
    String tmp[] = line.split(" ");
    int nn = Integer.parseInt(tmp[0]);
    int kk = Integer.parseInt(tmp[1]);
    String[] data = new String[nn];
    line = br.readLine();
    String tmp2[] = line.split(" ");
    int[] aa = new int[nn];
    for (int i = 0; i < tmp2.length; i++) {
      aa[i] = Integer.parseInt(tmp2[i]);
    }
    int answer = 0;
    int min = nn;
    int depth = 0;
    while(true) {
      int cnt = 0;
      for (int j = 1; j <= nn; j++) {
        data[(j - 1)] = null;
        depth = 0;
        int i = j;
        String tmpData = Integer.toString(j);
        while(true) {
          int x = aa[(i - 1)];
          i = x;
          depth++;
          tmpData = tmpData + "," + i;
          if (x == 1) {
            break;
          }
        }
        if (min >= depth && depth > kk) {
          min = depth;
        }
        if (depth > kk) {
          data[(j - 1)] = tmpData;
          cnt++;
        }
      }
      if (cnt == 0) {
        break;
      }
      for (int i = 1; i <= nn; i++) {
        String wrkStr = data[(i - 1)];
        if (wrkStr != null) {
          String[] wrk = wrkStr.split(",");
          int len = wrk.length - 1;
          if (len == min) {
            aa[(i - 1)] = 1;
            answer++;
            break;
          }
        }
      }
    }
    System.out.print(answer);
  }
}
