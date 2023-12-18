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
	    }
	    	
	    	
	    System.out.println(cnt);
	}
	
	public static boolean s(int n) {
		String sn=String.valueOf(n);
		boolean f3=false;
		boolean f5=false;
		boolean f7=false;
		for (int i=0; i<sn.length(); i++) {
			char c = sn.charAt(i);
			if (c=='3') {
				f3=true;
			}else if (c=='5') {
				f5=true;
			}else if (c=='7') {
				f7=true;
			} else {
				return false;
			}
		}
		
		if (f3 && f5 && f7) {
		    return true;
		} else {
			return false;
		}
	}
}