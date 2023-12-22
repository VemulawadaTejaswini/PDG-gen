import java.util.Scanner;
class Main {
	int H,W,x,y;
	public void suzuki(){
		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();
		while(H != 0 || W != 0){
			for(x = 0;x < H;x++){
				for(y = 0;y < W;y++){
					System.out.print("#");
				}
				System.out.println("");
			}
			System.out.println("");
			H = sc.nextInt();
			W = sc.nextInt();
		}
	}
	public static void main(String[] args){
		new Main().suzuki();
	}
}