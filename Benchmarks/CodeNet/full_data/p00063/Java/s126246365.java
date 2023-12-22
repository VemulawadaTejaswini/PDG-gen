import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String before, after;
		int cnt = 0;
		while(sc.hasNext()) {
			before = sc.next();
			
			StringBuffer sb = new StringBuffer(before);
			after = String.valueOf(sb.reverse());
			
			if(before.equals(after)) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}