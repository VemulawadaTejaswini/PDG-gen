import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    Map<Integer, ArrayList<Integer>> map = new HashMap<>();
    for(int i = 0; i < M; i++){
      int x = sc.nextInt();
      int y = sc.nextInt();
      if(!map.containsKey(x)){
        map.put(x, new ArrayList<Integer>());
      }
      List<Integer> list = map.get(x);
      list.add(y);
    }
    int[] memo = new int[N+1];
    Arrays.fill(memo, -1);
    System.out.println(solve(map, memo));
  }
  
  public static int solve(Map<Integer, ArrayList<Integer>> map, int[] memo){
    int max = -1;
    for(int i = 1; i <=memo.length; i++){
      max = Math.max(max, saiki(map, i, memo));
    }
    return max;
  }
  
  public static int saiki(Map<Integer, ArrayList<Integer>> map, int n, int[] memo){
    if(!map.containsKey(n)){
      return 0;
    }
    if(memo[n] != -1){
      return memo[n];
    }
    List<Integer> list = map.get(n);
    int max = -1;
    for(int i : list){
      max = Math.max(max, saiki(map, i, memo));
    }
    memo[n] = max+1;
    return max+1;
  }
}