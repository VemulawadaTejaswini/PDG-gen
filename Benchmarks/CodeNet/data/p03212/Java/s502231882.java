import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int n = Integer.parseInt(sc.next());
    int ans = 0;
    String s;
    
    for (int i=1; i<n; i+=2){
      s = i.toString(i);
      if (!(s.contains("3")||s.contains("5")||s.contains("7"))) {
        ans++;
      }
    }
    
    System.out.println(ans);

  }
}
