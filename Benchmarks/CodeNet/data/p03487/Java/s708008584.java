import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long[] a = new long[N];
    int remove_count = 0;
    ArrayList<Long> kind = new ArrayList<Long>();
    for(int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
    }
    for(int i = 0; i < N; i++) {
      if(!kind.contains(a[i])) {
        kind.add(a[i]);
      }
    }
    int kind_len = kind.size();
    for(int i = 0; i < kind_len; i++) {
      long j = kind.get(i);
      if(count_num(a, j) < j) {
        remove_count += count_num(a, j);
      } else if(count_num(a, j) > j) {
        remove_count += (count_num(a, j) - j);
      }
    }

    System.out.println(remove_count);
  }

  public static long count_num(long[] a, long num) {
    int count = 0;
    int len = a.length;
    for(int i = 0; i < len; i++) {
      if(a[i] == num) {
        count++;
      }
    }
    return count;
  }
}
