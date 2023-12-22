import java.io.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    BufferdReader br = new BufferedReader(new InputStreamReader(System.in));
    br.lines()
      .map(line -> line.split(" "))
      .map(ar -> Stream.of(ar).mapToInt(Integer::parseInt).sum())
      .map(String::value)
      .mapToInt(str -> str.length())
      .forEach(System.out::println);
  }
}