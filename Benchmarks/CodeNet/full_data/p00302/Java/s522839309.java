import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n, r, t, sum, pos;
		
		n = scan.nextInt();
		r = scan.nextInt();
		t = scan.nextInt();
		
		sum = 0;
		
		int[] p = new int[n];
		
		int[] water = new int[r];
		int[] empty = new int[r];
		
		for(int i = 0; i < n; i++) {
			p[i] = scan.nextInt();
		}
		
		for(int i = 1; i <= t; i++) {
			for(int j = 0; j < n; j++) {
				pos = (p[j] * i % r);
				
				if(i > 1) {
					empty[pos]++;
				}
				
				if(water[pos] > 0) {
					water[pos]--;
					
				} else {
					sum++;			
				}
			}
			
			for(int j = 0; j < r; j++) {
				if(empty[j] > 0) {
					water[j] += empty[j];
					empty[j] = 0;
				}
			}
			
		}
		
		System.out.println(sum);
		
		scan.close();
	}
}