import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int H = scan.nextInt();
			int W = scan.nextInt();

			if(H == 0 && W == 0){
				break;
			}
			for(int i = 0; i < H; i++){
				String str = "";
				for(int j = 0; j < W; j++){
					str += "#";
				}
				System.out.println(str);
			}
			System.out.println();
		}
	}
}