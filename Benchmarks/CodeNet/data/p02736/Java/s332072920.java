import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String num = sc.next();
		List<List<Integer>> tocyu = new ArrayList<>();
		tocyu.add(new ArrayList<>());
		for (int i = 0; i < num.length(); i++) {
			tocyu.get(0).add(Integer.valueOf(num.charAt(i)));
		}

		for (int i = 1; i < n; i++) {
			tocyu.add(new ArrayList<>());
			for (int j = 1; j < tocyu.get(i-1).size(); j++) {
				tocyu.get(i).add(Math.abs(tocyu.get(i-1).get(j) - tocyu.get(i-1).get(j-1)));
			}
		}
		System.out.println(tocyu.get(n-1).get(0));
	}

}
