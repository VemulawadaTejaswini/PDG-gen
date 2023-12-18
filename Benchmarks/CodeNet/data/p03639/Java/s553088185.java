import java.util.*;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
	int n = sc.nextInt();
    int istack;
    int cnt = 0;
    int cnt2 = 0;
    int cnt3 = 0;
    int ef;
    boolean yon =true;
    
    for(int i = 0; i < n;i++) {
      istack = sc.nextInt();
      if(istack % 4 == 0) cnt++;
      else if(istack % 2 == 0) cnt2++;
      else cnt3++;
    }
   	if(cnt3 > cnt*2) yon = false;
    else if(cnt3 == cnt*2){
      if(cnt2 == 1) yon = false;
    }

    if(yon) System.out.println("Yes");
    else System.out.println("No");

  }
}
