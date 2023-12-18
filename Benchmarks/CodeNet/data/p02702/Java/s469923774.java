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
      ArrayList<Integer> a0 = new ArrayList<Integer>();
      ArrayList<Integer> a1 = new ArrayList<Integer>();
      ArrayList<Integer> a2 = new ArrayList<Integer>();
    if (m_t[0] % 3 == 0) a0.add(0);
    if (m_t[0] % 3 == 1) a1.add(0);
    if (m_t[0] % 3 == 2) a2.add(0);
      for (int i=0; i<n; i++){
          m_t[i+1] = m[i] + m_t[i];
          if (m_t[i+1] % 3 == 0) a0.add(i+1);
          if (m_t[i+1] % 3 == 1) a1.add(i+1);
          if (m_t[i+1] % 3 == 2) a2.add(i+1);
      }
      
      for (int left=0; left < a0.size()-1; left++){
          for (int right=left+1; right<a0.size(); right++){
              String sub = input.substring(a0.get(left), a0.get(right));
                //   System.out.println("left:" + left);
                //   System.out.println("right:" + right);
                //   System.out.println(sub);

              if (isMultiple(sub, 10, 673)) {
                  res++;
                //   System.out.println(sub);
              }
          }
      }
    for (int left=0; left < a1.size()-1; left++){
          for (int right=left+1; right<a1.size(); right++){
              String sub = input.substring(a1.get(left), a1.get(right));
                // System.out.println("left:" + left);
                //   System.out.println("right:" + right);
                //   System.out.println(sub);

              if (isMultiple(sub, 10, 673)) {
                  res++;
                //   System.out.println(sub);
              }
          }
      }      
      for (int left=0; left < a2.size()-1; left++){
          for (int right=left+1; right<a2.size(); right++){
              String sub = input.substring(a2.get(left), a2.get(right));
                //                System.out.println("left:" + left);
                //   System.out.println("right:" + right);
                //   System.out.println(sub);

              if (isMultiple(sub, 10, 673)) {
                  res++;
                //   System.out.println(sub);
              }
          }
      }
    //   System.out.println(Arrays.toString(a0.toArray()));
    //   System.out.println(Arrays.toString(a1.toArray()));
    //   System.out.println(Arrays.toString(a2.toArray()));
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