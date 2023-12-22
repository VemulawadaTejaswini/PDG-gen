import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
	        int H = sc.nextInt();
	        int N = sc.nextInt();
    
	        int x1 = sc.nextInt();
	        int y1 = sc.nextInt();
	        int z = 0;
	        for(int i = 1; i < N; i++) {
	            int xi = sc.nextInt();
	            int yi = sc.nextInt();
	            if((x1 > xi && y1 < yi) || (x1 < xi && y1 > yi)) {
	                z = z + Math.abs(x1 - xi) + Math.abs(y1 - yi);
		    }else {
		        z = z + Math.max(Math.abs(x1 - xi), Math.abs(y1 - yi));
		    }
		    x1 = xi;
		    y1 = yi;
		}
	        System.out.println(z);
	    }
        }