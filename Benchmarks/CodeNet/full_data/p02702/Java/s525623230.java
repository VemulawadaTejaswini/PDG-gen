import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      String s = sc.next();

      long cnt = 0;
      Set<String> set = new HashSet<>();
      set.add("12114");
      set.add("14133");
      set.add("16152");
      set.add("18171");
      for(int i = 0; i < s.length(); i++) {
        long curCnt = 0;
        if(i + 5 <= s.length() && set.contains(s.substring(i, i + 5))) {
            int idx = i;
            while(idx + 5 <= s.length() && set.contains(s.substring(idx, idx + 5))) {
                curCnt++;
                idx += 5;
            }
            cnt += curCnt;
        }

      }

      System.out.println(cnt);
  }
}