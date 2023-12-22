import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		boolean fin = false;
		ArrayList<Integer> input = new ArrayList<Integer>();
		Scanner insert = new Scanner(System.in);
		while(true){
//			Scanner insert = new Scanner(System.in);
			String line = insert.nextLine();
			String array1[] = line.split(" ");
			int n = Integer.parseInt(array1[0]);
			int p = Integer.parseInt(array1[1]);
			if((n < 3) ||(n > 50) || (p < 2) || (p > 50)){
				break;
			}
			int tmpP = p;
			int[] hands = new int[n];
			for(int i = 0; i < hands.length; i ++) {
				hands[i] = 0;
			}
			int nowN = 0;
			while(true) {
				if(tmpP > 0) {
					hands[nowN]++;
					tmpP--;
				}
				else {
					if((tmpP == 0) && hands[nowN]>0) {

						tmpP = hands[nowN];
						hands[nowN] = 0;

					}
				}

				if((tmpP == 0) &&(hands[nowN] == p)) {

					input.add(nowN);
					break;
				}


				nowN++;
				if(nowN == (n)) {
					nowN = 0;
				}

			}

		}
		for(int a: input) {
			System.out.println(a);
		}
	}
}

