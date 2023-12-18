import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String s = sc.next();

      Map<Character, List<Integer>> map = new HashMap<>();
      map.put('R', new ArrayList<>());
      map.put('G', new ArrayList<>());
      map.put('B', new ArrayList<>());
      for(int i = 0; i < s.length(); i++)
        map.get(s.charAt(i)).add(i);

      char[] chs = new char[]{'R', 'G', 'B'};
      long sum = 0;
      for(char a : chs) {
        for(char b : chs) {
          if(a == b) continue;
          for(char c : chs) {
            if(a == c || b == c) continue;

            for(int i : map.get(a)) {
              for(int j : map.get(b)) {
                if( i >= j) continue;
                for(int k : map.get(c)) {
                  if(j >= k || j - i == k - j) continue;
                  sum++;
                }
              }
            }
          }
        }
      }

      System.out.println(sum);
  }
}
