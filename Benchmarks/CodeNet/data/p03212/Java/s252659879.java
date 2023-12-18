import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int N = Integer.parseInt(scanner.next());
	    
	    int cnt =0;
	    for (int i = 0; i < N; i++) {
	        if (s(i+1)) {
	        	cnt++;
	    }
	    	
	    	System.out.println(cnt);
	    }
	}
	
	public static boolean s(int n) {
		String sn=String.valueOf(n);
		for (int i=0; i<sn.length(); i++) {
			char c = sn.charAt(i);
			if ((c!='3') && (c!='5') && (c!='7')) {
				return false;
			}
		}
		return true;
	}
}