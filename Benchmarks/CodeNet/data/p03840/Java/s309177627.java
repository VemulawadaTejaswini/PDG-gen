import java.io.*;
import java.util.*;
public class Main {
  public static void main(String[] args) throws Exception {
    String line = null;
    long answer = 0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    line = br.readLine();
    String data[] = line.split(" ");
    long tetro[] = new long[7];
    for (int i = 0; i < 7; i++) {
      tetro[i] = Long.parseLong(data[i]);
    }
    // I = tetro[0], O = tetro[1], T = tetro[2], J = tetro[3], L = tetro[4], S = tetro[5], Z = tetro[6]
    // I, J, L の最小値
    long min = Math.min(tetro[0], Math.min(tetro[3], tetro[4]));
    // IとJとLのブロック
    answer = min * 3;
    // Iのブロック(残り)
    tetro[0] = tetro[0] - min;
    if (tetro[0] > 0) {
      if (tetro[0]%2 == 0) {
        answer = answer + tetro[0];
      } else {
        System.out.println("0");
        return;
      }
    }
    // Jのブロック(残り)
    tetro[3] = tetro[3] - min;
    if (tetro[3] > 0) {
      if (tetro[3]%2 == 0) {
        answer = answer + tetro[3];
      } else {
        System.out.println("0");
        return;
      }
    }
    // Lのブロック(残り)
    tetro[4] = tetro[4] - min;
    if (tetro[4] > 0) {
      if (tetro[4]%2 == 0) {
        answer = answer + tetro[4];
      } else {
        System.out.println("0");
        return;
      }
    }
    // Oのブロック
    if (tetro[1] > 0) {
      answer = answer + tetro[1];
    }
    System.out.println(answer);
  }
}