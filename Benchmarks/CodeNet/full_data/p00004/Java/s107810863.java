import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;
class Main {
  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    br.lines()
      .map(line -> Stream.of(line.split(" "))
                      .mapToInt(Integer::parseInt)
                      .toArray())
      .map(ar -> Stream.of(
                    new BigDecimal((double)(ar[1] * ar[5] - ar[4] * ar[2])/(ar[1] * ar[3] - ar[4] * ar[0])).setScale(3, RoundingMode.HALF_UP),
                    new BigDecimal((double)(ar[5] * ar[0] - ar[2] * ar[3])/(ar[0] * ar[4] - ar[1] * ar[3])).setScale(3, RoundingMode.HALF_UP)
      ).toArray())
      .forEach(xy -> System.out.println(xy[0].toString() + " " + xy[1].toString()));
  }
}