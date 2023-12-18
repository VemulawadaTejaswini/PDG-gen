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
		boolean f3=false;
		boolean f5=false;
		boolean f7=false;
		while (n!=0) {
			int a =n % 10;
			if (a==3) {
				f3=true;
			}else if (a==5) {
				f5=true;
			}else if (a==7) {
				f7=true;
			} else {
				return false;
			}
			n= (int)Math.floor((double)n / 10);
		}
		
		if (f3 && f5 && f7) {
		    return true;
		} else {
			return false;
		}
	}
}