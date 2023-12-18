import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    long cnt = 0;
    List<Long> sumNums = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      long a = Long.parseLong(sc.next());
      int j = 0;
      for (; j < sumNums.size();j++) {
        long sumNum = sumNums.get(j);
        long sum = sumNum + a;
        long xor = sumNum^a;
        if (xor == sum) {
          cnt++;
          sumNums.set(j, sum);
          continue;
        }
        break; 
      }
      if (j < sumNums.size()) {
        if (j == 0) sumNums = new ArrayList<>();
        else sumNums = sumNums.subList(0, j);
      }
      sumNums.add(0, a);
    }
    cnt+=n;
    System.out.println(cnt);
  }
}