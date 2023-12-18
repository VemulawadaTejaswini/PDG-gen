import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(), w = sc.nextInt();
		List<String> a = new ArrayList<>();
		for(int i = 0; i < h; i++) {
			String x = sc.next();
			boolean f = false;
			for(int j = 0; j < w; j++) {
				if(x.charAt(j) == '#') f = true;
			}
			if(f) {
				a.add(x);
			}
		}
		List<Integer> b = new ArrayList<>();
		for(int i = 0; i < w; i++) {
			boolean f = false;
			for(int j = 0; j < a.size(); j++) {
				if(a.get(j).charAt(i) == '#') f = true;
			}
			if(!f) {
				b.add(i);
			}
		}
		if(a.size() == 0) return;
		for(int i = 0; i < a.size(); i++) {
			for(int j = 0; j < a.get(0).length(); j++) {
				boolean f = false;
				for(int k = 0; k < b.size(); k++) {
					if(j == b.get(k)) f = true;
				}
				if(!f) System.out.print(a.get(i).charAt(j));
			}
			System.out.println();
		}
	}
}