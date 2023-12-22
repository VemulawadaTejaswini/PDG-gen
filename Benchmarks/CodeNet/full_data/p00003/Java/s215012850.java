import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(buf.readLine());
    for (int i = 0; i < N; i++) {
      String str = buf.readLine();
      String[] tmp = str.split(" ");
      int array[] = new int[3];
      for (i = 0; i < 3; i++) {
        array[i] = Integer.parseInt(tmp[i]);
      }
      int a, b, c;
      a = array[0] * array[0];
      b = array[1] * array[1];
      c = array[2] * arary[2];
      if ((a == b + c) || (b == a + c) || (c == a + b)) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}