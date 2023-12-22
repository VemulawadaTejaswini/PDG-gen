import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int res = 0;
    int a[] = new int[n];
    Part b[] = new Part[n];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      b[i] = new Part(a[i], i);
    }
    Arrays.sort(b);

    for (int i = 0; i < n; i++) {
      int maxHeight = Math.max(b[i].num, (n-1) - b[i].num);
      for (int j = i+1; j < n; j++) {
        if (b[j].height + b[i].height > maxHeight) {
          break;
        }
        if (b[j].height + b[i].height == Math.abs(b[j].num - b[i].num)) res++;
      }
    }
    System.out.println(res);
    sc.close();

  }

  static class Part implements Comparable<Part>{
    int height;
    int num;

    Part (int height, int num) {
      this.height = height;
      this.num = num;
    }

    @Override public int compareTo(Part other) {
      return Integer.compare(height, other.height);
    }
  }

}