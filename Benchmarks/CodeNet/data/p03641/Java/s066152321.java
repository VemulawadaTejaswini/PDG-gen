import java.util.Scanner;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Map;
import java.util.HashMap;

public class Main{
  static int n;
  static int[] p;

  static final int MAX = 200000;
  static final boolean DEBUG = false;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt();
    p = new int[n];
    for(int i = 0; i < n; i++){
      p[i] = sc.nextInt();
    }

    int[] pos = new int[MAX + 1];
    for(int i = 0; i < n; i++){
      pos[p[i]] = i;
    }

    ArrayList< Integer > a = new ArrayList< >(n);
    TreeSet< Integer > r = new TreeSet< >();
    for(int i = 0; i < n; i++){
      a.add(p[i]);
      r.add(p[i]);
    }

    Map< Integer, Integer > map = new HashMap< >();
    for(int i = 0; i < n; i++){
      map.put(p[i], i);
    }

    int[] ans = new int[n];
    int sp = 0;
    while(!r.isEmpty()){
      int x = r.first();
      int y = r.higher(x);
      if(DEBUG){
        System.out.println("x = " + x + ", y = " + y);
      }
      while(true){
        if(pos[x] > pos[y]){
          if(r.higher(y) == null){
            x = r.higher(x);
            y = r.first();
          }
          else{
            y = r.higher(y);
          }
          if(DEBUG){
            System.out.println("x = " + x + ", y = " + y);
          }
          continue;
        }
        if((pos[y] - pos[x] == map.get(y) - map.get(x)) &&
          ((pos[y] - pos[x] + 1) % 2 == 0) &&
          (map.get(x) % 2 == 0 && (n - map.get(y) + 1) % 2 == 0)){
          ans[sp++] = x;
          ans[sp++] = y;
          r.remove(x);
          r.remove(y);
          a.remove(new Integer(x));
          a.remove(new Integer(y));
          for(int i = 0; i < a.size(); i++){
            map.put(a.get(i), i);
          }
          map.remove(x);
          map.remove(y);
          if(DEBUG){
            System.out.println("added");
            System.out.println("x = " + x + ", y = " + y);
          }
          break;
        }
        else{
          if(r.higher(y) == null){
            x = r.higher(x);
            y = r.first();
          }
          else{
            y = r.higher(y);
          }
          if(DEBUG){
            System.out.println("x = " + x + ", y = " + y);
          }
        }
      }
    }

    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < n; i++){
      sb.append(ans[i] + " ");
    }

    System.out.println(sb);
  }
}