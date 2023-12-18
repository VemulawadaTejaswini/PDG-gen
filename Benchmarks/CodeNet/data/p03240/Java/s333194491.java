import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int[]x = new int[N];
			int[]y = new int[N];
			int[]h = new int[N];
			
			for(int i = 0;i<N;i++) {
				x[i] = scan.nextInt();
				y[i] = scan.nextInt();
				h[i] = scan.nextInt();
			}
			
			int count = 0;
			int countH = 0;
			
				for(int cx = 0;cx<=100;cx++) {
					for(int cy = 0;cy<=100;cy++) {
						count = 0;
						countH = 0;
						for(int i = 0;i<N;i++) {
							if(i==0) {
								countH = h[i]+Math.abs(x[i]-cx)+Math.abs(y[i]-cy);
								count++;
							}else {
								int k = h[i]+Math.abs(x[i]-cx)+Math.abs(y[i]-cy);
								if(k==countH)count++;
								
							}
						}
						
						if(count==N) {
							System.out.print(cx);
							System.out.print(" ");
							System.out.print(cy);
							System.out.print(" ");
							System.out.println(countH);
							System.exit(0);
							
						}
						
						
					}
					
				}
			
			
			
			
			
			
			
		}
		
		
	}
		

}
