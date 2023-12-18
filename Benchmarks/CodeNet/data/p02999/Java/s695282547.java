import java.util.Scanner;
import java.util.stream.Stream;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] nums = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    System.out.println(nums[0] < nums[1] ? 0 : 10);
  }
}