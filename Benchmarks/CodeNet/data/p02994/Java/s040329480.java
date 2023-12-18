import java.util.*;
 
public class Main {
  public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int num = Integer.parseInt(in.next());
	int len = Integer.parseInt(in.next());
	in.close();
	int total = sum(num, len);
	int eat = len;
    if (len < 0) {
      eat = num <= len * (-1) ? len + num - 1 : 0;
    }
    int ans = total - eat;
    System.out.println(ans);
  }
  
  static int sum(int num, int len) {
    num--;
    if (num == 0) return len;
    return len + sum(num, len + 1);
  }
}