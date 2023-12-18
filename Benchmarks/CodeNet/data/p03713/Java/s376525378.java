import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		long H = stdIn.nextInt();
		long W = stdIn.nextInt();
		
		if(H%3 == 0 || W%3 == 0) {
			System.out.println(0);
		}
		else if(H%3 == 1 && W%3 == 1) {
			long n = H/3;
			long m = W/3;
			long minH = Math.min(Math.max(3*n/2+m+1,2*m+1),Math.max(3*n+m+1,2*m));
			long minW = Math.min(Math.max(3*m/2+n+1,2*n+1),Math.max(3*m+n+1,2*n));
			if(H%2 == 0 && W%2 == 0) {
				System.out.println(Math.min(H/2, W/2));//
			}
			else if(H%2 == 1 && W%2 == 0) {
				System.out.println(Math.min(minH, W/2));
			}
			else if(H%2 == 0 && W%2 == 1) {
				System.out.println(Math.min(H/2, minW));
			}
			else {
				//System.out.println("ok");
				System.out.println(Math.min(minH, minW));
			}
		}
		else if(H%3 == 2 && W%3 == 2) {
			long n = H/3;
			long m = W/3;
			long minH = Math.min(Math.max(3*n+m+3,2*m+2),Math.max((3*n+3)/2+m,2*m+1));
			long minW = Math.min(Math.max(3*m+n+3,2*n+2),Math.max((3*m+3)/2+n,2*n+1));
			if(H%2 == 0 && W%2 == 0) {
				System.out.println(Math.min(H/2, W/2));
			}
			else if(H%2 == 1 && W%2 == 0) {
				System.out.println(Math.min(minH, W/2));
			}
			else if(H%2 == 0 && W%2 == 1) {
				System.out.println(Math.min(H/2, minW));
			}
			else {
				System.out.println(Math.min(minH, minW));//
			}
		}
		else {
			long N;
			long M;
			if(H%3 == 1) {
				N = H;
				M = W;
			}
			else {
				N = W;
				M = H;
			}
			long n = N/3;
			long m = M/3;
			long minN = Math.min(Math.max(3*n+m+2,2*m+2),Math.max(3*n/2+m+1,2*m+1));
			long minM = Math.min(Math.max((3*m+3)/2+n,2*n+1),Math.max(3*m+n+2,2*n));
			if(N%2 == 0 && M%2 == 0) {
				System.out.println(Math.min(N/2, M/2));//
			}
			else if(N%2 == 1 && M%2 == 0) {
				System.out.println(Math.min(minN, M/2));
			}
			else if(N%2 == 0 && M%2 == 1) {
				System.out.println(Math.min(N/2, minM));//
			}
			else {
				System.out.println("ok");
				System.out.println(Math.min(minN, minM));
			}
			
		}

	}

}