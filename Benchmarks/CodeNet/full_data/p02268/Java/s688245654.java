import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main (String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] s = Arrays
        .asList(br.readLine().split(" "))
        .stream()
        .mapToInt(i->Integer.valueOf(i))
        .toArray();

    int q = Integer.parseInt(br.readLine());
    int[] t = Arrays
        .asList(br.readLine().split(" "))
        .stream()
        .mapToInt(i->Integer.valueOf(i))
        .toArray();

    long count = Arrays.stream(t).filter(x -> binarySearch(s, x)).count();
    System.out.println(count);
  }

  private static boolean binarySearch(int[] s, int searchNum) {
    int mid = s.length / 2;
    if (s[mid] == searchNum) {
      return true;
    } else if (s.length <= 1) {
      return false;
    } else if (s[mid] > searchNum) {
      int[] nextS = Arrays.copyOfRange(s, 0, mid - 1);
      return binarySearch(nextS, searchNum);
    } else {
      int[] nextS = Arrays.copyOfRange(s, mid, s.length - 1);
      return binarySearch(nextS, searchNum);
    }
  }
}