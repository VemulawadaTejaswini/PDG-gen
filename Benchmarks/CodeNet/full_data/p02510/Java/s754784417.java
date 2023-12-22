import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s; int m, h;
		
		while(true){
			s = in.next(); // ????????????????????¨????????????
			if(s.equals("-")) break;
		
			for(m = in.nextInt(); m > 0; m--){
				h = in.nextInt();
				String tmp = s.substring(0, h);
				s = s.substring(h, s.length()) + tmp;
			}
			
			System.out.println(s);
		}
		
	}
}