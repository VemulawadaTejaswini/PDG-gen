import java.util.*;
import java.util.stream.*;
import java.io.*;
class Main {
  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    br.lines()
      .map(line -> Stream.of(line.split(" "))
                      .mapToInt(Integer::parseInt)
                      .toArray())
      .map(ar -> Stream.of(
                    (double)(ar[1] * ar[5] - ar[4] * ar[2])/(ar[1] * ar[3] - ar[4] * ar[0]),
                    (double)(ar[5] * ar[0] - ar[2] * ar[3])/(ar[0] * ar[4] - ar[1] * ar[3])
      ).toArray())
      .forEach(xy -> System.out.println(String.format("%.3f %.3f", xy[0], xy[1])));
  }
}