import java.util.*;
import java.math.*;
import java.io.BufferedInputStream;
public class Main{
    static TreeSet[] count;
    static int[] st;
    public static void main(String[] args){
        Scanner sc = new Scanner (new BufferedInputStream(System.in));
        int n = sc.nextInt();
        String s = sc.next();
        st = new int[n];
        int times = sc.nextInt();
        count = new TreeSet[26];
        for(int i = 0; i < n; ++i) {
            int index = s.charAt(i) - 'a';
            st[i] = index; 
            if(count[index] == null) {
                count[index] = new TreeSet<Integer>();
            }
            count[index].add(i);
        }
        for(int time = 0; time < times; ++time) {
            int type = sc.nextInt();
            int index = sc.nextInt();
            int third;
            if(type == 2) {
                third = sc.nextInt();
                query(index - 1, third);
            } else {
                third = sc.next().charAt(0) - 'a';
                change(index - 1, third);
            }
        }
      }

      private static void query(int start, int end) {
          int res = 0;
          for(int i = 0; i < 26; ++i) {
              if(count[i] == null) continue;
              Integer high = (Integer) count[i].ceiling(start);
              if(high != null && high >= start && high < end) res++;
          }
          System.out.println(res);
      }

      private static void change(int index, int target) {
          int ori = st[index];
        if(ori == target) return;
          count[ori].remove(index);
          st[index] = target;
          if(count[target] == null) count[target] = new TreeSet<Integer>();
          count[target].add(index);
      }
}