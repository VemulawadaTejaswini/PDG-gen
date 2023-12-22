import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] A;
		int n,time;
		int i;
		
		while(true) {
			n = sc.nextInt();
			A = new int[n];
			for (i=0 ; i<n ; i++) {
				A[i] = n-i;
			}
			time = sc.nextInt();
			
			if (n==0 && time==0) {
				break;
			}
			
			for (i=0 ; i<time ; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int[] A2;
				int j;
				A2 = new int[n];
				for (j =0 ; j<b ; j++) {
					A2[j] = A[a+j-1];
				}
				for (j=b ; j<a+b-1 ; j++) {
					A2[j] = A[j-b];
				}
				for (j = a+b-1 ; j<n ; j++) {
					A2[j] = A[j];
				}
				
				for (j=0 ; j<n ; j++) {
					A[j] = A2[j];
				}
			}
			
			for (i=0 ; i<n ; i++) {
				System.out.println(""+A[i]);
			}
		}
	}
}
