import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N];
    int remove_count = 0;
    ArrayList<Integer> kind = new ArrayList<Integer>();
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
      int j = kind.get(i);
      if(count_num(a, j) < j) {
        remove_count += count_num(a, j);
      } else if(count_num(a, j) > j) {
        remove_count += (count_num(a, j) - j);
      }
    }

    System.out.println(remove_count);
  }

  public static int count_num(int[] a, int num) {
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
