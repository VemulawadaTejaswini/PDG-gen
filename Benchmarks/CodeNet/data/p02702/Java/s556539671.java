import java.util.*;

public class Main { //クラス名はMain
    public static void main(String[] args) {
        //コード
      Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine();
      int n = input.length();
      int[] m = new int[n];
      int[] m_t = new int[n+1];
	  Long res = 0L;
      for (int i=0; i<n; i++)
        m[i] = input.charAt(i);
      for (int i=0; i<n; i++)
          m_t[i+1] = m[i] + m_t[i];
      
      for (int left=0; left<Math.max(0,n-3); left++) {
        for (int right=left+4; right<=n; right++) {
            if ((m_t[right] - m_t[left]) % 3 != 0) continue;
      	    String sub = input.substring(left, right);
            if (isMultiple(sub,10,673)) {
              res++;
            }
        }  
      }
      System.out.println(res);
    }
    static boolean isMultiple (String s, int base, int m) {
      int temp = 0;
      for (int i=0; i<s.length(); i++) {
          temp = (temp*base+Character.getNumericValue(s.charAt(i)))%m;
      }
      if (temp==0) {return true;}
      return false;
 	}
}