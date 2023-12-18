import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();
    
    int oddOk = 0;
    int oddCount = 0;
    int evenOk = 0;
    int evenCount = 0;
    
    //奇数
    for(int i = 0; i < s.length(); i += 2) {
      if (s.substring(i, i + 1).equals("R") ||
          s.substring(i, i + 1).equals("U") ||
          s.substring(i, i + 1).equals("D"))
      {
		oddCount ++;
        oddOk ++;
      } else {
        oddCount ++;
      }
    }
    
    //偶数
    for(int i = 1; i < s.length(); i += 2) {
      if (s.substring(i, i + 1).equals("L") ||
          s.substring(i, i + 1).equals("U") ||
          s.substring(i, i + 1).equals("D"))
      {
        evenCount ++;
        evenOk ++;
      } else {
        evenCount ++;
      }
    }
    
    //判定
    if (oddCount == oddOk && evenCount == evenOk) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}