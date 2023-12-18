import java.util.*;
 
public class Main {
	public static void main(String[] args) {
      	Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();
      	int b = sc.nextInt();
      	int c = a + b;
      	int d = a - b;
      	int e = a * b;
      	int ans = Math.max(c, d);
      	int ans = Math.max(ans, e);
      	System.out.println(ans);
    }
}