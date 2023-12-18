import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int M = scan.nextInt();
    //  List<Integer> l = new LinkedList<>();
    int[] array = new int[N];
    for (int i = 0; i < N; i++) {
      array[i] = scan.nextInt();
    }
    // List<Integer> sortedList = l.stream().sorted().collect(Collectors.toList());
    Arrays.sort(array);
    int B;
    int C;
    int sl;
    for (int i = 0; i < M; i++) {
      B = scan.nextInt();
      C = scan.nextInt();
      for (int j = 0; j < N; j++) {
        //sl = sortedList.get(j);
        sl = array[j];
        if (C <= sl) {
          break;
        }
        array[j] = C;
        //sortedList.set(j, C);

        B--;
        if (B <= 0) {
          break;
        }
      }
      // sortedList = sortedList.stream().sorted().collect(Collectors.toList());
      Arrays.sort(array);
    }
    long result = 0;

    for (int i = 0; i < array.length; i++) {
      result += i;
    }
    System.out.println(result);
  }
}
