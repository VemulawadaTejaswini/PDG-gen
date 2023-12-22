import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc .nextInt();
		while(true){
			if(h == 0 && w == 0)break;
			for (int x = 0; x < h; x++){
				for (int y = 0; y < w; y++) {
					System.out.print("#");
				}
				System.out.println("");
			}
		h = sc.nextInt();
		w = sc.nextInt();
		}
	}
}