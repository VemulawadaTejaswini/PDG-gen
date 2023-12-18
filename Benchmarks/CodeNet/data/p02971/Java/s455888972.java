import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int tmp = 0;
    ArrayList<Integer> ans1 = new ArrayList<Integer>();
    for (int i = 0; i < n; i++) {
      ans1.add(sc.nextInt());
    }
    int ans = Collections.max(ans1);
    for(int i = 0; i < n; i++){
      if(ans == ans1.get(i)){
        ans1.remove(i);
        if(ans1.contains(ans)){
          System.out.println(ans);
          ans1.add(i, ans);
        }else{
          tmp = Collections.max(ans1);
          ans1.add(i, ans);
          System.out.println(tmp);
        }
      }else{
        System.out.println(ans);
      }
    }
  }
}