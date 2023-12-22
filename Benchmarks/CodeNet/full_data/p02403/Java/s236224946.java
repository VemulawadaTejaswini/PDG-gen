import java.util.Scanner;
class Main {
	public void kami() {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int W = sc.nextInt();
		
		while(H != 0 || W != 0){
			while(0 < H){
				for(int i = 1; i <= W; i++){
					System.out.print("#");
				}
				System.out.println();
				H--;
			}
			System.out.println();
			H = sc.nextInt();
			W = sc.nextInt();
		}
		
	}

	public static void main(String[] args) {
		new Main().kami();
	}

}