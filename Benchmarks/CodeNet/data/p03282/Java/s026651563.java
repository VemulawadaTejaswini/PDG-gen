import java.util.Scanner;
import java.lang.Math;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String s = stdIn.next();
		long k = stdIn.nextLong();
		if (s.length() == 1) 
			System.out.println(s);
		else {
			String[] a = s.split("");
			int[] b = new int[a.length];
  			for(int i = 0; i < a.length; i++){
    			b[i] = Integer.parseInt(a[i]);
    		}
    		int t = 0;
    		if (b[0] != 1) 
    			System.out.println(b[0]);
    		else {
    			for (int j = 1; j < 100; j++) {
    				if (b[j] == 1)
    					t = j;
    				else
    					break;
    			}

    			if (k <= t+1) 
    				System.out.println(1);
    			else
    				System.out.println(b[t+1]);
    		}
    	}
	}
}