import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		long k = sc.nextLong();
		if(a > 0) {
			if(a >= k) {
				a = a - k;
			}
			else {
				k = k - a;
				a = 0;
				k = k - a;
				if(b > 0){
					if(b >= k) {
						b = b - k;
					}
					else {
						b = 0;
						k = k - b;
					}
				}
			}
		}
		else if(b > 0){
			if(b >= k) {
				b = b - k;
			}
			else {
				b = 0;
			}
		}
		
		System.out.print(a);
		System.out.print(" ");
		System.out.println(b);
	}
	
}