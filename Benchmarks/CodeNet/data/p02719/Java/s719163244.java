import java.util.*;
public class Main {
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	    int m = s.nextInt();
	    
    int res = getCommonDevider(n, m);
      if (res == 1) {
        return 0;
      }
      return res;
	}
}

int getCommonDevider(int n, int m) {
  int maxNum = Math.max(n,m);
  int minNum = Math.min(n,m);
  
  int surplus = maxNum % minNum;
  if (surplus == 0) {
    return minNum;
  }
  
  surplus = getCommonDevider(int surplus, int minNum);
  
  return surplus;
}