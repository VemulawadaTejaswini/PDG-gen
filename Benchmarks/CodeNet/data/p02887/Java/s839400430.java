import java.util.*;

class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = Integer.parseInt(sc.next());
      String S = sc.next();
      
      char[] ch = S.toCharArray();
      
      int result = 1;
      
      for (int i = 1; i < N; ++i) {
        if (ch[i - 1] != ch[i]) result++;
      }
      
      
      System.out.println(result);
    }

}