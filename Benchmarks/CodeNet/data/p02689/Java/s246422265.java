import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int hs[] = new int[n];
    boolean hjs[] = new boolean[n];
    int a,b;
    int count = 0;
    
    Arrays.fill(hjs,true);
    for(int i = 0;i < n;i++) hs[i] = sc.nextInt();
    for(int i = 0;i < m;i++) {
      a = sc.nextInt()-1;
      b = sc.nextInt()-1;
      if(hs[a] >= hs[b]) hjs[a] = false;
      else if(hs[a] <= hs[b]) hjs[b] = false;
    }
    
    for(int i = 0;i < n;i++) {
      if(hjs[i]) count++;
    }
        
    System.out.println(count);
 
  }
}
