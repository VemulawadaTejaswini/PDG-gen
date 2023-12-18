import java.util.*;

public class Main {
	public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      String S = sc.next();
      int min =753;
      for (int i=0; i<S.length()-2; i++) {
        String SS = S.substring(i,i+3);
        int num = Integer.parseInt(SS);
        min = Math.min(Math.abs(753 - num),min);
      }
      System.out.println(min);
    }
}