public class Main {

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int i;
		int j;
		while(true){
			int H = scan.nextInt();
			int W = scan.nextInt();
			if (H == 0 && W == 0) {
				break;
			}
			for(i = 0 ; i < H ; i++){
				for(j = 0 ; j < W ; j++){
					if(i == 0 || i == H - 1 || j == 0 || j == W - 1){
						System.out.print("#");
					}
					else {
						System.out.print(".");
					}
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}