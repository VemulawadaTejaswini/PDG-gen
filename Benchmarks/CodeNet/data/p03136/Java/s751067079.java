import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			int k = sc.nextInt();
			list.add(k);
		}
		Collections.sort(list);
		int max = list.get(list.size() - 1);
		int plus = 0;
		for (int j = 0; j < list.size() - 1; j++) {
			plus += list.get(j);
		}
		if(plus < max) {
			System.out.println("NO");
		}else {
			System.out.println("YES");
		}
			
	}
}