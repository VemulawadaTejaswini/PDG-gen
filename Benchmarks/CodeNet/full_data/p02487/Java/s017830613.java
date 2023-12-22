//½ÄH cm æ± W cm Ìgð`­vO
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int width = sc.nextInt();
		while(height != 0 || width != 0){
			for(int i= 0; i < height;i++){
				for(int j = 0; j < width; j++){
					if(i == 0 || i == height -1){
						System.out.print("#");
					}
					else{
						if(j == 0 || j == width -1){
							System.out.print("#");
						}
						else{
							System.out.print(".");
						}
					}
				}
				System.out.println("");
			}
			System.out.println("");
			height = sc.nextInt();
			width = sc.nextInt();
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}