import java.io.*;
import java.util.*;
public class Main {
  public static void main(String[] args) throws Exception {
    String line = null;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    line = br.readLine();
    String[] in1 = line.split(" ");
    int nn = Integer.parseInt(in1[0]);
    int xx = Integer.parseInt(in1[1]);
    line = br.readLine();
    String[] cc = line.split(" ");
    int[] data = new int[cc.length];
    for (int i = 0; i < cc.length; i++) {
      data[i] = Integer.parseInt(cc[i]);
    }
// 最小値と合計を求める
    int min = data[0];
    long sum1 = 0L;
    for (int i = 0; i < nn; i++) {
      if (data[i] < min) {
        min = data[i];
      }
      sum1 = sum1 + data[i];
    }
// 毎回魔法を唱える
    long sum2 = 0L;
    sum2 = (min * nn) + (xx * (nn - 1));
// 比較する
    long answer = 0L;
    if (sum1 < sum2) {
      answer = sum1;
    } else {
      answer = sum2;
    }
    System.out.println(answer);
  }
}