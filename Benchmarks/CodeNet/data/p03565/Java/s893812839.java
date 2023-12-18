
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		String s =sc.next();
		String t =sc.next();

		int sl = s.length();
		int tl = t.length();

		ArrayList<String>ansl = new ArrayList<>();
		for(int i=0; i<sl; i++) {
			boolean ok=true;
			for(int j=0; j<tl; j++) {
				if(i+j>=sl) {
					ok=false;
					break;
				}
				if(s.charAt(i+j)=='?') {
					continue;
				}
				if(s.charAt(i+j)!=t.charAt(j)) {
					ok=false;
					break;
				}
			}
			if(ok) {
				StringBuffer sb  = new StringBuffer(s);
				sb.replace(i, i+tl, t);
				for(int j=0; j<sl; j++) {
					if(sb.charAt(j)=='?') {
						sb.replace(j, j+1, "a");
					}
				}
				ansl.add(sb.toString());
			}
		}
		Collections.sort(ansl);
		if(ansl.size()==0) {
			System.out.println("UNRESTORABLE");
		}else {
			System.out.println(ansl.get(0));
		}
		sc.close();
	}


}
