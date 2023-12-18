import java.util.Scanner;

class Main {
	public static void main(String[] args) {
	
		Scanner stdIn = new Scanner(System.in);
		
		byte n = stdIn.nextByte();
		
		int[] p = new int[n];
		for (int i = 0; i < n; i++) {
			p[i] = stdIn.nextInt();
		}
		int total = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n; j++) {
				if (p[i] < p[j]) {
					p[i] = p[i] + p[j];
					p[j] = p[i] - p[j];
					p[i] = p[i] - p[j];
				}
			}
		}
	
		p[0] /= 2;
		
		for (int i = 0; i < n; i++) {
			total += p[i];
		}
		
		System.out.println(total);
		
	}
}