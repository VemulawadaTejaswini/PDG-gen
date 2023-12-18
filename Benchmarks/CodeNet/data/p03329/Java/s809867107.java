import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int count = 0;
		while(N >= 36) {
			int del9 = 0;
			for (int i = 2; Math.pow(9, i) <= N; i++) {
				del9 = i;
			}
			
			int del6 = 0;
			for (int i = 2; Math.pow(6, i) <= N; i++) {
				del6 = i;
			}
			
			if (Math.pow(6, del6) >= Math.pow(9, del9)) {
				count++;
				N -= Math.pow(6, del6);
			} else {
				count++;
				N -= Math.pow(9, del9);
			} 
		}

		if (N % 9 == 0) {
			count += N / 9;
			N = 0;
		}
		
		if (N % 6 == 0) {
			count += N / 6;
			N = 0;
		}
		
		while(N - 9 >= 14) {
			N -= 9;
			count++;
		}
		
		if (N == 14) {
			count += 4;
		} else if (N == 13) {
			count += 3;
		} else if (N == 11) {
			count += 3;
		} else if (N == 10) {
			count += 2;
		} else if (N == 8) {
			count += 3;
		} else if (N == 7) {
			count += 2;
		} else {
			count += N;
		}
		
		
		
		
		System.out.println(count);
	}
	
}