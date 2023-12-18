import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) throws IOException {
    String[] strs;
    String[] nums;
    List<String> numbers
      = new ArrayList<String>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));
    try(BufferedReader br
        = new BufferedReader(new InputStreamReader(System.in))
    ){
      strs = br.readLine().split(" ");
      nums = br.readLine().split(" ");
    }
    int N = Integer.parseInt(strs[0]);
    int K = Integer.parseInt(strs[1]);
    numbers.removeAll(Arrays.asList(nums));
    String sum = null;
    for (int a = 9-K; a >= 0; a--) {
      for (int b = 9-K; b >= 0; b--) {
        for (int c = 9-K; c >= 0; c--) {
          for (int d = 9-K; d >= 0; d--) {
            if (N <= Integer.parseInt(numbers.get(a) + numbers.get(b) + numbers.get(c) + numbers.get(d))) {
              sum = numbers.get(a) + numbers.get(b) + numbers.get(c) + numbers.get(d);
            }
          }
        }
      }
    }
    System.out.println(sum);
  }
}