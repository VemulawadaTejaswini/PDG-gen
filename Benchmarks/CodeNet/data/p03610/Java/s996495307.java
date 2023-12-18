import java.util.*;
import java.util.stream.IntStream;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    IntStream.range(0,s.length())
    .filter(i -> i%2 == 1)
    .forEach(
      i -> System.out.print(s.charAt(i))
    );
    System.out.println();
  }
}