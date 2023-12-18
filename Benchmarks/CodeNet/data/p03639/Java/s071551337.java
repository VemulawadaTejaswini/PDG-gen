import java.util.*;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
	int n = sc.nextInt();
    int istack;
    int cnt = 0;
    
    for(int i = 0; i < n;i++) {
      istack = sc.nextInt();
      if(istack % 4 == 0) cnt += 3;
      else if(istack % 2 == 0) cnt++;
    }
    
    if(cnt >= n) System.out.println("Yes");
    else System.out.println("No");

  }
}
