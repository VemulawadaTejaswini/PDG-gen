import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> after = new ArrayList<>();
		List<String> ansArray = new ArrayList<>();
		
		String in, ans = "";
		String[] before;
		int tmp;
		while(sc.hasNext()) {
			in = sc.next();
			before = in.split("");
			
			for(int i = 0; i < before.length; i++) {
				if(before[i].equals("@")) {
					tmp = Integer.parseInt(before[i + 1]);
					for(int j = 0; j < tmp; j++) {
						after.add(before[i + 2]);
					}
					i += 2;
				} else {
					after.add(before[i]);
				}
			}
			
			for(int i = 0; i < after.size(); i++) {
				ans += after.get(i);
			}
			ansArray.add(ans);
			
			after.clear();
			ans = "";
		}
		
		for(String i : ansArray)	System.out.println(i);
	}
}