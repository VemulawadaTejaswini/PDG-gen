import java.util.Scanner;

class Main {
	public static void main(String args []) {
		Scanner scan = new Scanner(System.in);
			
		int n, q, com, x, y, sum;
			
		n = scan.nextInt();
		q = scan.nextInt();
			
		int a[] = new int[n];
			
		for(int i = 0; i < n; i++) {
			a[i] = 0; 
		}
			
		for(int i = 0; i < q; i++) {
			com = scan.nextInt();
			x = scan.nextInt();
			y = scan.nextInt();
			
			if(com == 0) { //add
				a[x - 1] += y;
				
			} else if (com == 1) { //sum
				sum = 0;
				
				for(int j = x - 1; j < y; j++) {
					sum += a[j];
				}
					
				System.out.println(sum);
			}
		}
		
		scan.close();
	}
}