import java.util.*;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
      long A =sc.nextLong(),ans=0;
      String B = sc.next();
      ans += 100*A*Character.getNumericValue(B.charAt(0));
      ans += 10*A*Character.getNumericValue(B.charAt(2));
      ans += A*Character.getNumericValue(B.charAt(3));
      System.out.println(ans/100);
	}
}