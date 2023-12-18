import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int datalen = Integer.parseInt(br.readLine());
    String d = br.readLine();
    StringTokenizer st = new StringTokenizer(d);

    int[] data = new int[datalen];
    for (int i = 0; i < data.length; i++) {
      data[i] = Integer.parseInt(st.nextToken());
    }

    int min = Integer.MAX_VALUE, tmp;

    // data.length-1回最小値を求める
    for (int i = 0; i < data.length - 1; i++) {
      int snk = data[0], arai = data[datalen - 1];

      // i回snkにdata[j+1]を加算代入
      for (int j = 0; j < i; j++) {
        snk += data[j + 1];
      }

      // data.length-2回araiに加算代入
      for (int j = data.length; j > i + 2; j--) {
        arai += data[j - 2];
      }

      tmp = snk - arai;

      if (Math.abs(tmp) < min) {
        min = Math.abs(tmp);
      }
      
      if (min == 0) {
        break;
      }
    }

    System.out.println(min);
  }

}