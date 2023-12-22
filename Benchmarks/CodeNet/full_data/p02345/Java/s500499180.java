import java.util.Scanner;

class Main {
	
	public static void main(String args []) {
		Scanner scan = new Scanner(System.in);
		
		int n, q, com, x, y, min;
		
		n = scan.nextInt();
		q = scan.nextInt();
		
		int a[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = (int)(Math.pow(2, 31) - 1); 
		}
		
		for(int i = 0; i < q; i++) {
			com = scan.nextInt();
			x = scan.nextInt();
			y = scan.nextInt();
		
			if(com == 0) { //update	
				a[x] = y;
				
			} else if (com == 1) { //find
				min = (int)(Math.pow(2, 31) - 1);
				
				for(int j = x; j <= y; j++) {
					if(a[j] < min) {
						min = a[j];
					}
				}
				
				System.out.println(min);
			}
		}
		
		scan.close();
	}

}