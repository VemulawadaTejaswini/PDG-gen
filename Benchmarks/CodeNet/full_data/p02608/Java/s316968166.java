import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    sc.close();
    int[] cnt = new int[n];
    
    for (int i=0; i<n; i++) cnt[i]=0;
    
    for (int x=1; x<=(int)Math.sqrt((int)n); x++) {
      for (int y=1; y<=(int)Math.sqrt((int)n); y++) {
        for (int z=1; z<=(int)Math.sqrt((int)n); z++) {
          int ans = x*x+y*y+z*z+x*y+x*z+y*z;
          if (ans <= n) cnt[ans-1]++;
        }
      }
    }
    
    for (int i=0; i<n; i++)
      System.out.println(cnt[i]);
  }
}