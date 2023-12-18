import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
    HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();
    for(int i = 0; i < n; i++) {
      int v = sc.nextInt();
      if((i % 2) == 0) {
        if(map1.containsKey(v)) {
          map1.put(v, map1.get(v) + 1);
        } else {
          map1.put(v, 1);
        }
      } else {
        if(map2.containsKey(v)) {
          map2.put(v, map2.get(v) + 1);
        } else {
          map2.put(v, 1);
        }
      }
    }
    int k1 = 0;
    int k2 = 0;
    int m1 = 0;
    int m2 = 0;
    
    int l1 = 0;
    int l2 = 0;
    int n1 = 0;
    int n2 = 0;

    int s = 0;
    int t = 0;
    int q1 = 0;
    int q2 = 0;

    int p1 = 0;
    int p2 = 0;

    int s1 = 0;
    int s2 = 0;

    ArrayList<Integer> list1 = new ArrayList<Integer>();
    ArrayList<Integer> list2 = new ArrayList<Integer>();

    for(int key : map1.keySet()) {
      s++;
      p1 = key;
      if(q1 < map1.get(key)) s1 = key;
      list1.add(map1.get(key));
      q1 = Math.max(q1, map1.get(key));
    }

    for(int key : map2.keySet()) {
      t++;
      p2 = key;
      if(q2 < map2.get(key)) s2 = key;
      list2.add(map2.get(key));
      q2 = Math.max(q2, map2.get(key));
    }

    Collections.sort(list1); 
    Collections.sort(list2); 

    int ans = 0;

    if(s == 1) {
      if(t == 1) {
        if(p1 == p2) ans = n / 2;
      } else {
        ans = (n / 2 - q2);
      }
    } else {
      if(t == 1) {
        ans = (n / 2 - q1);
      } else {
        if(s1 == s2) {
          ans = n - list1.get(list1.size() - 1) - list2.get(list2.size() - 2);
          ans = Math.min(ans, n - list1.get(list1.size() - 2) - list2.get(list2.size() - 1));
        } else {
          ans = (n - q1 - q2);
        }
      }      
    }
    
    System.out.println(ans);
  }
}
