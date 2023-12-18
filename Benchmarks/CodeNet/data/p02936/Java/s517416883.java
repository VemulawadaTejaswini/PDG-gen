import java.util.*;
 
public class Main{
  static int[] ans;
  static Map<Integer, List<Integer>> map;
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int Q = Integer.parseInt(S[1]);
    ans = new int[N];
    
    map = new HashMap<>();
    for(int i = 0; i < N-1; i++){
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      if(map.get(a) == null){
        map.put(a, new ArrayList<Integer>());
        map.get(a).add(b);
      }else{
        map.get(a).add(b);
      }
    }
    
    for(int i = 0; i < Q; i++){
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      ans[a-1] += b;
    }
    
    for(int i = N; i > 0; i--){
      if(map.get(i) != null){
        func(i-1, ans[i-1], map.get(i));
      }
    }
    
    for(int i = 0; i < N; i++){
      if(i < N-1){
        System.out.print(ans[i]);
        System.out.print(" ");
      }else{
        System.out.println(ans[i]);
      }
    }
  }
  public static void func(int a, int b, List<Integer> list){
    for(int i = 0; i < list.size(); i++){
      int M = list.get(i);
      ans[M-1] += b;
      if(map.get(M) != null){
        func(M-1, b, map.get(M));
      }
    }
  }
}