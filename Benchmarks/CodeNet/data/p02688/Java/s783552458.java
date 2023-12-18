import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		Map<Integer,String> m = new HashMap<Integer,String>();

		for(int i = 0;i < k;i++) {
			int d = sc.nextInt();
			for(int x = 0;x < d;x++) {
				int a = sc.nextInt();
				m.put(Integer.valueOf(a), "a");
			}
		}

		System.out.println(n - m.size());
	}
}