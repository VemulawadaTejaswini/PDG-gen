import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = 0;
		int W = 0;
		String sh = "#";
		String dot = ".";
		while(true) {
			H = sc.nextInt();
			W = sc.nextInt();
			if(H == 0 && W ==0)break;
			
			for(int i = 0; i < H; i++) {
				if(i%2==0) {
					for(int j = 0; j < W; j++) {
						if(j%2==0) {
							System.out.print(sh);
						} else {
							System.out.print(dot);
						}
					}
					System.out.println("");
				} else {
					for(int j = 0; j < W; j++) {
						if(j%2==0) {
							System.out.print(dot);
						} else {
							System.out.print(sh);
						}
					}
					System.out.println("");
				}
			}
			System.out.println("");
		}
		sc.close();
	}
}

