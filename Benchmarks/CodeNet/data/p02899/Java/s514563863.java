import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] A = new int[N+1];

		HashMap<Integer, Integer>map = new HashMap<Integer, Integer>();
		for (int i=1; i<=N; i++){
			int param = sc.nextInt();
			map.put(param, i);
		}
		StringBuffer sb = new StringBuffer();
		for (int i=1; i<=N; i++){
			if (sb.length() > 0){
				sb.append(" ");
			}
			sb.append(map.get(i));
		}
		System.out.println(sb.toString());

	}
}