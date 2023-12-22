import java.util.*;
import java.util.stream.*;
import java.io.*;
class Main {
  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int[] mt = new int(10);
      for (int i = 0; i < 10; i++) {
        mt[i] = Integer.parseInt(br.readLine());
      }
      Arrays.stream(mt)
        .sorted((e1, e2) -> e1.compareTo(e2))
        .limit(3)
        .forEach(System.out::println);
    }
  }
}