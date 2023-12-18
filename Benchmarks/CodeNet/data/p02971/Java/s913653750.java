import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int tmp;
    ArrayList<Integer> ans1 = new ArrayList<Integer>();
    int[] ans2 = new int[n];
    for (int i = 0; i < n; i++) {
      ans1.add(sc.nextInt());
    }
    for(int i = 0; i < n; i++){
      tmp = ans1.get(i);
      ans1.remove(i);
      ans2[i] = Collections.max(ans1);
      ans1.add(i, tmp);
    }
    for(int i = 0; i < n; i++){
      System.out.println(ans2[i]);
    }
  }
}