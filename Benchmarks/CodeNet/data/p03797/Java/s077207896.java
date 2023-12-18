import java.util.*;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long K = sc.nextLong();
    long cnt = N;
    long c = K - N * 2;
    cnt += c / 4;
    System.out.println(cnt);
  }
}
