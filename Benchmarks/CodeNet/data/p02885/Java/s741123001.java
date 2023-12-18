import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 0;

    List<Integer> ds = new ArrayList<>();
    for (int i = 0; i < n; i++) {
        ds.add(sc.nextInt());
    }
    
    for(int i = 0; i < n - 2; i++) {
        for(int j = i + 1; j < n - 1; j++) {
            for(int k = j + 1; k < n; k++) {
                if(ds.get(i) + ds.get(j) <= ds.get(k)) break;
                if(ds.get(j) + ds.get(k) <= ds.get(i) || ds.get(k) + ds.get(i) <= ds.get(j)) continue;
                ans++;
            }
        }
    }
    
    System.out.println(ans);
  }
}
