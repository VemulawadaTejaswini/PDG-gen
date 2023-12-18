import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
	
		int N = keyboard.nextInt();
		
		int[]A = new int[N]; 
		for(int i = 0; i<N; i++) {
			A[i] = keyboard.nextInt();
		}
		
		int check1 = 0;
		int check2 = 0;
		int check3 = 0;
		int check4 = 0;
		String ans = "Yes";
		
		for(int j = 0; j<N-2; j++) {
			if(j == 0) {
				check1 = A[j]^A[j+1];
				check2 = A[j+1]^A[j+2];
				if(check1 != A[j+2] || check2 != A[j]) {
					ans = "No";
					break;
				}
			}else if(j == 1) {
				check1 = A[j]^A[j-1];
				check2 = A[j]^A[j+2];
				if(check1 != A[j+2] || check2 != A[j-1]) {
					ans = "No";
					break;
				}
				check3 = A[j+1]^A[j-1];
				check4 = A[j+1]^A[j-2];
				if(check3 != A[j+2] || check4 != A[j-1]) {
					ans = "No";
					break;
				}
			}else if(N > 4 && j == N-3) {
				check1 = (A[j]/2)^(A[j-2]/2);
				check2 = (A[j]/2)^(A[j+2]/2);
				if(check1 != (A[j+2]/2) || check2 != (A[j-2]/2)) {
					ans = "No";
					break;
				}
				check3 = (A[j+1]/2)^(A[j-1]/2);
				check4 = (A[j+1]/2)^(A[j+2]/2);
				if(check3 != (A[j+2]/2) || check4 != (A[j-1]/2)) {
					ans = "No";
					break;
				}
			}else {
				check1 = (A[j]/2)^(A[j-2]/2);
				check2 = (A[j]/2)^(A[j+2]/2);
				if(check1 != (A[j+2]/2) && check2 != (A[j-2]/2)) {
					ans = "No";
					break;
				}
			}
		}
		System.out.println(ans);
		keyboard.close();	
	}
}
