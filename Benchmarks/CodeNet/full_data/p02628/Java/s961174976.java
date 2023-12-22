import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main{
  public static void main(String[] args) throws Exception{
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  int k = sc.nextInt();
	  ArrayList<Integer> a = new ArrayList<Integer>();
	  while(n-- > 0) {
		  a.add(sc.nextInt());
	  }
	  Collections.sort(a);
	  int ans = 0;
	  for(int i = 0; i < k; i++) {
		  ans += a.get(i);
	  }
	  System.out.println(ans);
  }
}