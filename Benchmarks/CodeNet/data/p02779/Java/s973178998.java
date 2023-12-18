import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    HashSet<Integer> g = new HashSet<Integer>();
    for (int i=0;i<n;i++){
      g.add(scan.nextInt());
    }

    if (g.size() < n){
      System.out.println("NO");
    }
    else{
      System.out.println("YES");
    }
  }
}
