import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		List<Integer> listH = new ArrayList<Integer>();
		List<Integer> listW = new ArrayList<Integer>();
		for(;;){
			int H = scan.nextInt();
			int W = scan.nextInt();
			if((H == 0) && (W == 0)){
				break;
			}
			listH.add(H);
			listW.add(W);
		}

		for(int i = 0; i < listH.size(); i++){
			int h = listH.get(i);
			int w = listW.get(i);
			for(int j = 0; j < h; j++){
				for(int k = 0; k < w; k++){
					if((j == 0) || (j == h - 1) || (k == 0) || (k == w - 1)){
						System.out.print("#");
					} else{
						System.out.print(".");
					}
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
}