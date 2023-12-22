import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int n,k;
    n = scanner.nextInt();
    k = scanner.nextInt();
    
    ArrayList<Integer> p = new ArrayList<Integer>();
    
    int x;
    for(int i = 0;i < n ; i++) { 
      x = scanner.nextInt();
      p.add(x);
    }
    
    Collections.sort(p);
    
    int ans = 0;
    for(int i = 0; i < k;i++) { 
      ans+=p.get(i);
    }
    
    System.out.println(ans);
}
}