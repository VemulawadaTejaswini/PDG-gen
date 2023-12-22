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

		for(int k = 0; k < listH.size(); k++){
			int h = listH.get(k);
			int w = listW.get(k);
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					System.out.print("#");
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
}