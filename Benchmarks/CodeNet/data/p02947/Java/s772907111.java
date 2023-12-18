import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Map<String, Integer> s = new HashMap<String, Integer>();
    char[] c;
    String ds;
    for (int i=0;i<n;i++){
      c = sc.next().toCharArray();
      Arrays.sort(c);
      ds = new String(c);
      s.put(ds,s.getOrDefault(ds,0)+1);
    }
    long ans = 0;
    for (int i:s.values()){
      ans += i*(i-1)/2;
    }
    System.out.println(ans);
  }
}