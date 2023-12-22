import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = null;
    while (!(line = br.readLine()).equals("0 0")) {
      String[] str = line.split(" ", 2);
      int H = Integer.parseInt(str[0]);
      int W = Integer.parseInt(str[1]);
      for (int i = 0; i < H; i++) {
        for (int j = 0; j < W; j++) {
          // if (i % 2 == 1) {
          //   if (j % 2 == 1) {
          //     System.out.print("#");
          //   } else {
          //     System.out.print(".");
          //   }
          // } else {
          //   if (j % 2 == 1) {
          //     System.out.print(".");
          //   } else {
          //     System.out.print("#");
          //   }
          // }
          if ((i + j) % 2 == 0) {
            System.out.print("#");
          } else {
            System.out.print(".");
          }
        }
        System.out.print("\n");
      }
      System.out.print("\n");
    }
  }
}