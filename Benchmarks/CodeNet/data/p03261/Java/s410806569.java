import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		List<String> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextLine());
		}

		List<String> listB = new ArrayList<String>(new HashSet<>(list));

		String result = "Yes";
		if (list.size() != listB.size()) {
			result = "No";
		}
		
		for (int k = 1; k < n; k++) {
			if(list.get(k-1).length() == 0) {
				result ="No";
				break;
			}
			String before = list.get(k - 1);
			String beforeLast = before.substring(before.length()-1, before.length());
			String after = list.get(k);
			String afterFirst = after.substring(0, 1);
			
			if (!beforeLast.equals(afterFirst)) {
				result = "No";
				break;
			}
		}
		
		System.out.println(result);

	}

}
