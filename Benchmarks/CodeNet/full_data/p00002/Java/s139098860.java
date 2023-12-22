import java.io.*;

public class Main {
  public static void main(String[] args) {
    BufferdReader br = new BufferdReader(new InputStreamReader(System.in));
    // while ((String line = br.readLine()) != null) {
    //   int sum = Integer.parseInt(line.split(" ")[0]) + Integer.parseInt(line.split(" ")[1]);
    //   System.out.println(String.valueOf(sum).length());
    // }
    br.lines()
      .map(line -> line.split(" "))
      .map(ar -> Stream.of(ar).mapToInt(Integer::parseInt).sum())
      .map(String::value)
      .mapToInt(str -> str.length())
      .forEach(System.out::println);
  }
}