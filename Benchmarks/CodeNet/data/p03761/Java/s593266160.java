import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] s = new String[n];
    for (int i=0;i<n;i++){
      s[i] = sc.next();
    }
    Map<Character,Integer> a = new HashMap<>();
    for (char i:s[0].toCharArray()){
      a.put(i,a.getOrDefault(i,0)+1);
    }
    Map<Character,Integer> da = new HashMap<>();
    for (int i=1;i<n;i++){
      da.clear();
      for (char j:s[i].toCharArray()){
        da.put(j,da.getOrDefault(j,0)+1);
      }
      List<Character> ac = new ArrayList<>(a.keySet());
      for (char k:ac){
        if (da.containsKey(k)){
          a.put(k,Math.min(a.get(k),da.get(k)));
        }else{
          a.remove(k);
        }
      }
      if (a.size() == 0) break;
    }
    List<Character> ac = new ArrayList<>(a.keySet());
    Collections.sort(ac);
    StringBuilder ans = new StringBuilder();
    for (char i:ac){
      for (int j=0;j<a.get(i);j++){
        ans.append(String.valueOf(i));
      }
    }
    System.out.println(ans.toString());
  }
}