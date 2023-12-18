import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.util.Collections;

public class Main { //クラス名はMain
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      PrintWriter out = new PrintWriter(System.out);
      String[] paras = sc.next().split(" ");
      int n = Integer.parseInt(paras[0]);
      int m = Integer.parseInt(paras[1]);
      Map<Integer,List<Integer>> map = new HashMap<>();
      for(int i = 0;i<n;i++){
        String[] reward = sc.next().split(" ");
        int day = Integer.parseInt(reward[0]);
        int num = Integer.parseInt(reward[1]);
        if(day > m) continue;
        if(map.containsKey(day)){
          List<Integer> l = map.get(day);
          l.add(num);
          map.put(day,l);
        }else{
          List<Integer> l = new ArrayList<>();
          l.add(num);
          map.put(day,l);
        }
      }
      
      int[] taken = new int[m+1];
      for(int i = m;i>=1;i--){
        if(map.containsKey(i)){
          List<Integer> l = map.get(i);
          Collections.sort(l,Comparator.reverseOrder());
          map.put(i,l);
        }else taken[i] = -1;
      }
      
      long ans = 0;
      for(int i = m;i>=1;i--){
        int max = 0;
        int last = 0;
        for(j = i;j<=m;j++){
          if(taken[i] < 0) continue;
          List<Integer> l = map.get(j);
          if(taken[i] >=l.size()) continue;
          if(l.get(taken[i]) > max){
            max = taken[i];
            taken[last]--;
            taken[i]++;
            last = i;
          }
        }
        ans += max;
      }
      
      out.println(ans);
      out.flush();
    }
}
