import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String num = sc.next();
		List<List<Integer>> tocyu = new ArrayList<>();
		tocyu.add(new ArrayList<>());
		for (int i = 0; i < num.length(); i++) {
			tocyu.get(0).add(Character.getNumericValue(num.charAt(i)));
		}

		if (n>=4) {
			while(tocyu.get(tocyu.size()-1).size()>3) {
				tocyu.add(new ArrayList<>());
				int i = tocyu.size()-1;
				int size = tocyu.get(i - 1).size();
				if (size % 2 == 0) {
					for (int j = 1; j < size; j += 2) {
						tocyu.get(i).add(Math.abs(tocyu.get(i - 1).get(j) - tocyu.get(i - 1).get(j - 1)));
					}
				} else {
					for (int j = 1; j < size - 1; j += 2) {
						tocyu.get(i).add(Math.abs(tocyu.get(i - 1).get(j) - tocyu.get(i - 1).get(j - 1)));
					}
					tocyu.get(i).add(tocyu.get(i - 1).get(size - 1));
				}
			}
		}

		while(tocyu.get(tocyu.size()-1).size()>1) {
			tocyu.add(new ArrayList<>());

			int size = tocyu.get(tocyu.size()-2).size();
			int i = tocyu.size()-1;
			for (int j = 1; j < size; j++) {
				tocyu.get(i).add(Math.abs(tocyu.get(i-1).get(j) - tocyu.get(i-1).get(j-1)));
			}
		}
		System.out.println(tocyu.get(tocyu.size()-1).get(0));
	}

}
