import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    String s = sc.next();
    char[] t = new char[q];
    char[] d = new char[q];
    Map<Character, List<Integer>> map = new HashMap<>();
    for(int i = 0; i < n; i++){
      char tmp = s.charAt(i);
      if(!map.containsKey(tmp)){
        map.put(tmp, new ArrayList<Integer>());
      }
      map.get(tmp).add(i);
    }
    for(int i = 0; i < q; i++){
      t[i] = sc.next().charAt(0);
      d[i] = sc.next().charAt(0);
    }
    int sum = n;
    int[] a = new int[n];
    Arrays.fill(a, 1);
    for(int i = 0; i < q; i++){
      List<Integer> list = map.get(t[i]);
      if(list == null) continue;
      for(int j : list){
        if(j == 0 && d[i] == 'L'){
          sum -= a[j];
        }else if(j == n-1 && d[i] == 'R'){
          sum -= a[j];
        }else if(d[i] == 'L'){
          a[j-1] += a[j];
        }else{
          a[j+1] += a[j];
        }
        a[j] = 0;
      }
    }
    System.out.println(sum);
  }
}