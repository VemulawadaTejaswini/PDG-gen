import java.util.*;

public class Main {
	Scanner sc;
	
	String reverse(String s) {
		String tmp = "";
		for (int i=s.length()-1;i>=0;i--) tmp += s.charAt(i);
		return tmp;
	}
	
	void run() {
		sc = new Scanner(System.in);
		int count = 0;
		while(sc.hasNext()) {
			String s = sc.next();
			String left = s.substring(0,s.length()/2);
			String right = s.substring(s.length()-s.length()/2);
			right = reverse(right);
			if(left.compareTo(right)==0) count++;
		}
		
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}