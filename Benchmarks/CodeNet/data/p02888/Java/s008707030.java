import java.util.*;

public class Main {
  public static void main(String... args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    ArrayList<Integer> L = new ArrayList();
    
    for(int i=0; i<N; i++) {
      L.add(scan.nextInt());
    }
    Collections.sort(L);
    
    int ans = 0;
    for(int start=0; start<N; start++) {
      for(int end=L.size()-1; start<end; end--) {
        for(int target = end-1; target>start; target--) {
          if(L.get(start)+L.get(target) > L.get(end)) {
            ans++;
          } else {
            break;
          }
        }
      }
    }
    System.out.println(ans);
  }
}