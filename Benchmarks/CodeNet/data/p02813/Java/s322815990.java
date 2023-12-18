import java.util.*;

public class Main {
  public static int[] kai;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    kai = new int[9];
    kai[0] = 1;
    for(int i = 1; i < 9; i++) {
      kai[i] = (i * kai[i - 1]);
    }
    int n = sc.nextInt();
    ArrayList<Integer> listp = new ArrayList<Integer>();
    ArrayList<Integer> listq = new ArrayList<Integer>();
    for(int i = 0; i < n; i++) {
      listp.add(sc.nextInt());
    }
    for(int i = 0; i < n; i++) {
      listq.add(sc.nextInt());
    }
    int a = dfs(listp.get(0), listp);
    int b = dfs(listq.get(0), listq);
    System.out.println(Math.abs(a - b));
  }

  public static int dfs(int p, ArrayList<Integer> list) {
    int t = list.size();
    int ret = (p - 1) * kai[t - 1];
    if(t == 1) {
      return 1;
    } else {
      ArrayList<Integer> list2 = new ArrayList<Integer>();
      for(int i = 1; i < t; i++) {
        list2.add(list.get(i));
      }
      ArrayList<Integer> list3 = list2;
      Collections.sort(list3);
      int k = 0;
      for(int i = 0; i < (t - 1); i++) {
        if(list3.get(i) == list2.get(0)) {
          k = (i + 1);
          break;
        }
      }
      ret += dfs(k, list2);
      return ret;
    }
  }
}