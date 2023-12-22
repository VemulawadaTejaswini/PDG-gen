import java.util.Scanner;
class Main {
	int W = 0,H = 0,I = 0,F = 0,A = 0,Z = 0;
	public void pr() {
		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();
		while(H != 0 || W != 0) {
			for(I = 0;I < H; I++) {
				for(F = 0;F < W; F++) {
					if(I == 0||I == H - 1||F == W - 1) {
						System.out.print("#");
					} else {
						if(F == 0) {
							Z = 0;
						}
						if(Z == 0) {
							System.out.print("#");
							Z++;
						}
						for(A = W - 3;A < W-2&&F != 0;A++) {
							System.out.print(".");
						}
					}
					if(F == W - 1) {
						System.out.println();
					}
				}
			}
				System.out.println();
			H = sc.nextInt();
			W = sc.nextInt();
		}
	}
	public static void main(String[] args) {
		new Main().pr();
	}
}