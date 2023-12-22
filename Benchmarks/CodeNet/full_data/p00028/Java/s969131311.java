import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
  public static void main(String args[] ) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String s = "";
    int[] list = new int[9];
    while((s = br.readLine()) != null){
      int n = Integer.parseInt(s);
      list[(n-1)] += 1;
    }

    int max = 0;
    for ( int l: list) {
      if (l > max) {
        max = l;
      }
    }

    for (int i = 0; i < 9; i++) {
      if (list[i] == max) {
        System.out.println(i+1);
      }
    }
  }
}