import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] A = new int[N];
		int count = 0;
		for(int i = 0; i < N; i++) {
			A[i] = scan.nextInt();
		}
		if(N % 2 == 0) {
			for(int i = 1; i < N; i += 2) {
				for(int j = 0; j < N; j++) {
					if(A[j] == i) {
						count++;
					}
				}
				if(count ==2) {
					
				} else {
					count = -1;
					break;
				}
				count = 0;
			}
		} else if(N % 2 == 1) {
			for(int i = 0; i < N; i += 2) {
				for(int j = 0; j < N; j++) {
					if(A[j] == i) {
						count++;
					}
				}
				if(i == 0) {
					if(count ==1) {
						
					} else {
						count = -1;
						break;
					}
				} else {
					if(count ==2) {
						
					} else {
						count = -1;
						break;
					}
				}
				count = 0;
			}
		}
		
		if(count == -1) {
			System.out.println(0);
		} else {
			System.out.println(((int)Math.pow(2, N / 2)) % ((int)Math.pow(10, 9) + 7));
		}
		scan.close();
	}

}
