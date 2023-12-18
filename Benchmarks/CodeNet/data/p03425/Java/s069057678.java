import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]k = new int[5];
		int N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			char c = sc.next().charAt(0);
			if(c == 'M') k[0]++;
			else if(c == 'A') k[1]++;
			else if(c == 'R') k[2]++;
			else if(c == 'C') k[3]++;
			else if(c == 'H') k[4]++;
		}
		sc.close();
		long sum = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = i + 1; j < 4; j++) {
				for(int l = j + 1; l < 5; l++) {
					sum += (long)k[i] * k[j] * k[l];
				}
			}
		}
		System.out.println(sum);
	}
}