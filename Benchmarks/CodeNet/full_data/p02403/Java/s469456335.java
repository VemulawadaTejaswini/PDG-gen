import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			
			if(h == 0 && w == 0) {
				break;
			}else {
				for(int i1 = 0; i1 < h; i1++) {
					for(int i2 = 0; i2 < w; i2++) {
						System.out.print("#");
					}
					System.out.println();
				}
				System.out.println();
			}
		}
	}
}

