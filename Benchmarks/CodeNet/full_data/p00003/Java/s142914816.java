import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(buf.readLine());
    for (int i = 0; i < N; i++) {
      String[] tmp = buf.readLine().split(" ");
      int array[] = new int[3];
      for (int j = 0; j < 3; j++) {
        array[i] = Integer.parseInt(tmp[i]);
      }
      if (array[2] * array[2] == array[1] * array[1] + array[0] * array[0]) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}