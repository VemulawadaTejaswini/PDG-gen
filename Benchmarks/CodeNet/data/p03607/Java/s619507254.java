import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer,Integer> map =new HashMap<Integer,Integer>();
		int N= sc.nextInt();
		for (int i=0;i<N;i++) {
			int b = sc.nextInt();
			if (map.containsKey(b)==true) {
				map.remove(b);
			} else {
				map.put(b, 0);
			}
		}
		System.out.println(map.size());
	}
}