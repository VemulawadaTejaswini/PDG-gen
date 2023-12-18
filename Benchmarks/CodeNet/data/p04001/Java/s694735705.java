import java.util.*;

public class Main {
  private static List<String> list = new ArrayList<>();
  private static long ans = 0;
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    String[] numbers = sc.next().split("");
    String str = numbers[0];
    recursive(1, numbers, str);
    list.stream().map(e -> e.split("\\+")).forEach(e -> {
      ans += Arrays.stream(e).mapToLong(Long::parseLong).sum();
    });
    System.out.println(ans);
  }
  public static void recursive(int index, String[] arr, String str) {
    if(index >= arr.length) {
      list.add(str);
      return;
    }
    recursive(index + 1, arr, str + "+" + arr[index]);
    recursive(index + 1, arr, str + arr[index]);
  }
}
