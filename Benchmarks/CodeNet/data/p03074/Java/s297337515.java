import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    String s = sc.next();
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    ArrayList<Integer> list2 = new ArrayList<Integer>();
    for(int i = 0; i < s.length(); i++) {
      if(i == 0) {
        if(s.charAt(i) == '1') list1.add(i);
      } else {
        if((s.charAt(i) == '1') && (s.charAt(i - 1) == '0')) list1.add(i);
      }
    }
    for(int i = 0; i < s.length(); i++) {
      if(i == s.length() - 1) {
        if(s.charAt(i) == '1') list2.add(i);
      } else {
        if((s.charAt(i) == '1') && (s.charAt(i + 1) == '0')) list2.add(i);
      }
    }
    Collections.sort(list1);
    Collections.sort(list2);
    int ans = 0;
    if(list1.size() == 0) {
      ans = n;
    } else {
      if(list1.get(0) == 0){
        if(list1.size() <= k) {
          ans = n;
        } else {
          ans = Math.max(ans, list2.get(k) + 1);
          for(int i = k + 1; i < list1.size(); i++) {
            ans = Math.max(ans, list2.get(i) - list1.get(i - k) + 1);
          }
        }
      } else {
        if(list1.size() <= k - 1) {
          ans = n;
        } else {
          ans = Math.max(ans, list2.get(k - 1) + 1);
          for(int i = k; i < list1.size(); i++) {
            ans = Math.max(ans, list2.get(i) - list1.get(i - k) + 1);
          }
        }
      }
      int p = list2.size();
      if(list2.get(p - 1) == n - 1) {
        if(p <= k) {
          ans = n;
        } else {
          ans = Math.max(ans, n - 1 - list1.get(p - 1 - k) + 1);
          for(int i = p - 2 - k; i >= 0; i--) {
            ans = Math.max(ans, list2.get(i + k) - list1.get(i) + 1);
          }
        }
      } else {
        if(p <= k - 1) {
          ans = n;
        } else {
          ans = Math.max(ans, n - 1 - list1.get(p - k) + 1);
          for(int i = p - 1 - k; i >= 0; i--) {
            ans = Math.max(ans, list2.get(i + k) - list1.get(i) + 1);
          }
        }
      }
    }
    System.out.println(ans);
  }
}