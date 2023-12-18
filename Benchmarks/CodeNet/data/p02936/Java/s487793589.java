import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int q = sc.nextInt();
      Map<Integer, List<Integer>> tree = new HashMap<>();
      for(int i = 1; i < n; i++) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(!tree.containsKey(a))
          tree.put(a, new ArrayList<>());
        tree.get(a).add(b);
      }
      
      long[] arr = new long[1+n];
      for(int i = 0; i < q; i++)
        arr[sc.nextInt()] += sc.nextLong();

      long curSum = 0;
      for(int i = 1; i <= n; i++) {
        curSum = arr[i];
        if(i == n) System.out.println(curSum);
        else System.out.print(curSum + " ");
        if(tree.containsKey(i))
        for(int adj : tree.get(i)) {
          arr[adj] += curSum;
        }
      }
  }
}