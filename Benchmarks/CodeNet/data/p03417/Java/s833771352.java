import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long N = scn.nextLong();
		long M = scn.nextLong();
		long ans = 0;
		if(N < 3 || M < 3) {
			ans = 0;
		}else {
			if(N==3) {
				if(M == 3) {
					ans = 9;
				}else  if (M==4){
					ans = 6;
				}else {
					ans = 6 + 3 * (M-4);
				}
			}else if(N==4){
				if(M == 3) {
					ans = 6;
				}else  if (M==4){
					ans = 4;
				}else {
					ans = 4 + 2 * (M-4);
				}
			}else {
				if(M == 3) {
					ans = 6 + 3 * (N-4);
				}else  if (M==4){
					ans = 4 + 2 * (N-4);
				}else {
					ans = 4 + 2 * (M-4) + 2 * (N-4) + (M-4)*(N-4);
				}
			}

		}
		System.out.println(ans);

	}

}
