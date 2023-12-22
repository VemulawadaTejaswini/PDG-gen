import java.util.*;
import java.lang.*;

class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		while (true) {
			String s = sc.next();
			if(s.equals("-")) break;
			int shuffles = sc.nextInt();
			for (int i=0; i<shuffles; i++){
				int h = sc.nextInt();
				String tmp = s.substring(h, s.length());
				tmp+=s.substring(0, h);
				s =tmp;
			}
		
		System.out.println(s);
		
		}
		
	}
}
