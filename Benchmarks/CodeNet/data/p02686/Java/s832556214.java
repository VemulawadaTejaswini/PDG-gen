import java.util.*;

public class Main {
	static class Bracket {
		int diff;
		int bottom;
		public Bracket(int diff, int bottom) {
			this.diff = diff;
			this.bottom = bottom;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		ArrayList<Bracket> list = new ArrayList<>();
		for(int i=0; i<N; i++) {
			char[] c = sc.next().toCharArray();
			int cur = 0;
			int bottom = 0;
			for(int j=0; j<c.length; j++) {
				if(c[j]=='(') {
					cur++;
				} else {
					cur--;
					bottom = Math.min(bottom, cur);
				}
			}
			list.add(new Bracket(cur, bottom));				
		}
		
		Collections.sort(list, new Comparator<Bracket>() {
			public int compare(Bracket b1, Bracket b2) {
				if(Integer.signum(b1.diff) != Integer.signum(b2.diff))
					return - Integer.signum(b1.diff) + Integer.signum(b2.diff);
				else
					return - Integer.signum(b1.diff)*b1.bottom + Integer.signum(b2.diff)*b2.bottom;
			}
		});
		
		int pos = 0;

		for(Bracket b : list) {
			if(pos + b.bottom < 0) {
				System.out.println("No");
				sc.close();
				return;
			}
			pos += b.diff;
		}
		
		System.out.println(pos==0 ? "Yes" : "No");

		sc.close();
	}

}
