import java.util.*;

class Main {
  public static void main(String[] args) {
    Map<Integer, Integer> count = new HashMap<>();
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int sum = 0;
    for(int i =0; i < n; i++) {
      a[i] = sc.nextInt();
      sum += a[i];
      count.put(a[i], count.getOrDefault(a[i], 0) + 1);
    }
    
    int q = sc.nextInt();
    
    for(int i =0; i < q; i++) {
      int b = sc.nextInt();
      int c = sc.nextInt();
      int temp = count.getOrDefault(b, 0);
      sum += (c - b)*temp;

      count.put(b, 0);
      count.put(c, count.getOrDefault(c, 0) + temp);
      System.out.println(sum);
    }
  }
}
