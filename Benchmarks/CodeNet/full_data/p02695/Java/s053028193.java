import java.util.*;

public class Main{
  static int max = 0;
  static Scanner sc = new Scanner(System.in);
  static int N = sc.nextInt();
  static int M = sc.nextInt();
  static int Q = sc.nextInt();
  static int[][] req = new int[4][Q];
    static int[] a = new int[Q];
    static int[] b = new int[Q];
    static int[] c = new int[Q];
    static int[] d = new int[Q];
  
    public static void main(String[] args){
      for(int i = 0 ; i < Q ; i++){
        a[i] = sc.nextInt() - 1;
        b[i] = sc.nextInt() - 1;
        c[i] = sc.nextInt();
        d[i] = sc.nextInt();     
      }
      List<Integer> list = new ArrayList<>();      
      dfs(list);
      System.out.println(max);
	}
  static void dfs(List<Integer> list){
    if(list.size() == N){
      int sum = 0;
      for(int j = 0 ; j < Q ; j++){
      if (list.get(b[j]) - list.get(a[j]) == c[j])
                    sum += d[j];
      }
        if(max < sum)
          max = sum;
        return;
    }
    for(int i = 0 ; i < 10 ; i++){
    if(list.size() == 0 || i >= list.get(list.size() - 1) && i <= M - 1){
      list.add(i);
      dfs(list);
      list.remove(list.size() - 1);
    }
    }
  }
}
  