import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String tmp = sc.next();
		//int tmp = sc.nextInt();
		//Long tmp = sc.nextLong();
      int N = sc.nextInt();
      int K = sc.nextInt();
      if(N >= 2 * (K - 1) + 1){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
	}
}
