import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int xmin = a*100/8;
		int xmax = (a+1)*100/8;
		
		int ymin = b*100/10;
		int ymax = (b+1)*100/10;
		
		int ans = -1;
		for(int i = xmin; i<xmax; i++) {
			for(int j = ymin; j<ymax; j++) {
				if(j ==i) {
					System.out.println(j);
					return;
				}
			}
		}
		System.out.println(-1);
		
	}
	
	
}
