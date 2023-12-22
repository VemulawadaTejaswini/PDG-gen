import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		for(;;){
			int h = sc.nextInt();
			int w = sc.nextInt();
			if(h == 0 && w == 0){
				break;
			}
			for(int i = 1; i <= h; i++){
				if(i % 2 == 1) {
					for(int j = 1; j <=w; j++){
						if(j % 2 == 1){
							System.out.print("#");
						}
						else{
							System.out.print(".");
						}
					}
					System.out.println("");
				}
				else{
					for(int j = 1; j <= w; j++){
						if(j % 2 == 1){
							System.out.print(".");
						}
						else{
							System.out.print("#");
						}
					}
					System.out.println("");
				}
			}
			System.out.println("");
		}
	}

}