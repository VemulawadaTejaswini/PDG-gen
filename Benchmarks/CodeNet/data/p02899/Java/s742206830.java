import java.util.HashMap;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,Integer>hm = new HashMap<Integer,Integer>();

		int n = sc.nextInt();
		
		for(int i = 1; i <= n ; i++) {
			int a = sc.nextInt();
			hm.put(a, i);
		}
		for(int i = 1 ; i <= n ;i++) {
			int ans = hm.get(i);
			System.out.println(ans);
		}
		
			}

}
