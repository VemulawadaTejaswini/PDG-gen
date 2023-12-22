import java.util.Scanner;

class Main {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		long N = stdIn.nextLong();
		int count = 0;
		int z = 0;
		int p = 0;
		int sousa = 0;
				
		for(int i=1; i<=N; i++) {
			count = 0;
			
			for(int j=1; j<=i; j++) {
				if(i%j == 0) {
					count++;
				}
			}
	
			if(i == 1) {
				count = 1;
			}
			
			if(count == 2) {
				p = i;
				for(int e=1; Math.pow(p,e) <= N; e++) {
					z = (int)Math.pow(p, e);
					if(N%z == 0) {
						N /= z;
						sousa++;
					}
				}
			}
		}
		
		System.out.println(sousa);
	}
}
					