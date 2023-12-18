import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    long[] a = new long[n];
    long sum = 0;
    for(int i = 0; i < n; i++) {
      a[i] = Long.parseLong(sc.next());
      sum += a[i];
    }
    long temp = 0;
    long answer = 0;
    int index = 0;
    if(sum % 2 == 1) {
      for(index = 0; index < n; index++) {
        temp += a[index];
        if(sum / 2 <= temp) {
          break;
        }
      }
      if(temp == sum / 2 && temp != index + 1) answer = 1;
      else answer = Math.min(temp * 2 - sum, sum - 2 * temp + 2 * a[index]);
    } else {
      for(index = 0; index < n; index++) {
        temp += a[index];
        if(sum / 2 <= temp) {
          break;
        }
      }
      answer = Math.min(temp * 2 - sum, sum - 2 * temp + 2 * a[index]);
    }
    System.out.println(answer);
  }
}
