import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int t = sc.nextInt();
		int s = sc.nextInt();
      
      if (d == 0 || s == 0 || t == 0) {
System.out.println("No");
      }
      
      if (d / s <= t) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
      
		
	}
}