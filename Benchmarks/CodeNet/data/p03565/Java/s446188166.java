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

		for(int i=sl-1; i>=0; i--) {
			boolean ok=true;
			for(int j=0; j<tl; j++) {
				if(i+tl-1>=sl) {
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
				for(int j=0; j<i; j++) {
					if(s.charAt(j)=='?') {
						System.out.print('a');
					}else {
						System.out.print(s.charAt((j)));
					}
				}
				System.out.println(t);
				sc.close();
				return;
			}
		}
		System.out.println("UNRESTORABLE");
		sc.close();
	}


}
