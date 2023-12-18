import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int[] l = new int[n];
    for(int i = 0; i < n; i++) {
      l[i] = sc.nextInt();
    }
    int ans = Integer.MAX_VALUE;
    for(int i = 1; i < (int)Math.pow(4, n); i++) {
      int la = 0;
      int lb = 0;
      int lc = 0;
      for(int j = 0; j < n; j++) {
        int s = i / (int)Math.pow(4, j);
        s = s % 4;
        if(s == 1) la += l[j];
        if(s == 2) lb += l[j];
        if(s == 3) lc += l[j]; 
      }
      if((la > 0) && (lb > 0) && (lc > 0)) {
        int t = Math.abs(la - a) + Math.abs(lb - b) + Math.abs(lc - c);
        ans = Math.min(ans, t);
      }
    }
    System.out.println(ans);
  }
}