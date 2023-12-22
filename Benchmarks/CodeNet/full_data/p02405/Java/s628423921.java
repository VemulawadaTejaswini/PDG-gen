import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String a = "#";
		String b = ".";
		Boolean c = true;
		while (true) {
			Integer h = sc.nextInt();
			Integer w = sc.nextInt();
			
			if(h == 0 && w == 0) {
				return;
			}
			
			for(Integer i = 0; i < h; i++) {
				if (i % 2 != 0) {
					c = false;
				} else {
					c = true;
				}
				
				for (Integer j = 0;j < w;j++) {
					if (c) {
						System.out.print(a);
						c = false;
					}else {
						System.out.print(b);
						c = true;
					}
				}
				System.out.println();
			}
			System.out.println();
			c = true;
		}
	}
}
