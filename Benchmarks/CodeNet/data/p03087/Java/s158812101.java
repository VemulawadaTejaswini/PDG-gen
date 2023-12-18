import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    String[] nq = new String[2];
    char[] s = null;
    List<String[]> lr = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      nq = br.readLine().split("\\s");
      s = br.readLine().toCharArray();
      for (int i = 0; i < Integer.parseInt(nq[1]); i++) {
        lr.add(br.readLine().split("\\s"));
      }
    } catch (IOException e) {
      e.printStackTrace();
      System.exit(1);
    }

    boolean[] acjedge = new boolean[s.length-1];
    for (int i = 0; i < s.length-1; i++) {
      if (s[i] == 'A' && s[i+1] == 'C') {
        acjedge[i] = true;
      } else {
        acjedge[i] = false;
      }
    }

    int[] result = new int[lr.size()];
    int idx = 0;
    for (String[] array : lr) {
      final int start = Integer.parseInt(array[0]) - 1;
      final int end = Integer.parseInt(array[1]) -1;

      for (int i = start; i < end; i++) {
        if (acjedge[i]) {
          result[idx]++;
        }
      }
    idx++;
    }

    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i]);
    }
  }
}
